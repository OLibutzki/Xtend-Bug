package sampleproject;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.Matcher;
import org.junit.Assert;
import sampleproject.IsPredicateMatcher;
import sampleproject.SomeInterface;

@SuppressWarnings("all")
public class UsageExample {
  public void test1() {
    final SomeInterface someInterface = null;
    final Function1<SomeInterface, Boolean> _function = new Function1<SomeInterface, Boolean>() {
      public Boolean apply(final SomeInterface it) {
        return Boolean.valueOf(it.isValid());
      }
    };
    Matcher<SomeInterface> _is = IsPredicateMatcher.<SomeInterface>is(_function);
    Assert.<SomeInterface>assertThat(((SomeInterface) someInterface), _is);
  }
  
  public void test2() {
    final SomeInterface someInterface = null;
    final Function1<SomeInterface, Boolean> _function = new Function1<SomeInterface, Boolean>() {
      public Boolean apply(final SomeInterface ifc) {
        return Boolean.valueOf(ifc.isValid());
      }
    };
    Matcher<SomeInterface> _is = IsPredicateMatcher.<SomeInterface>is(_function);
    Assert.<SomeInterface>assertThat(someInterface, _is);
  }
  
  public void test3() {
    final SomeInterface someInterface = null;
    final Function1<SomeInterface, Boolean> _function = new Function1<SomeInterface, Boolean>() {
      public Boolean apply(final SomeInterface it) {
        return Boolean.valueOf(((SomeInterface) it).isValid());
      }
    };
    Matcher<SomeInterface> _is = IsPredicateMatcher.<SomeInterface>is(_function);
    Assert.<SomeInterface>assertThat(someInterface, _is);
  }
  
  public void test4() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field valid is undefined for the type UsageExample");
  }
}
