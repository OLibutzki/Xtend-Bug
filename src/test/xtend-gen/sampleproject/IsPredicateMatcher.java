package sampleproject;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

@SuppressWarnings("all")
public class IsPredicateMatcher<T extends Object> extends BaseMatcher<T> {
  private Function1<? super T, ? extends Boolean> predicate;
  
  public IsPredicateMatcher(final Function1<? super T, ? extends Boolean> predicate) {
    this.predicate = predicate;
  }
  
  public boolean matches(final Object object) {
    return (this.predicate.apply(((T) object))).booleanValue();
  }
  
  public void describeTo(final Description description) {
    description.appendValue(this.predicate);
  }
  
  public static <T extends Object> Matcher<T> is(final Function1<? super T, ? extends Boolean> predicate) {
    return new IsPredicateMatcher<T>(predicate);
  }
}
