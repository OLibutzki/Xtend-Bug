package sampleproject

import org.hamcrest.BaseMatcher
import org.hamcrest.Description

class IsPredicateMatcher<T> extends BaseMatcher<T> {

	(T)=>boolean predicate

	new((T)=>boolean predicate) {
		this.predicate = predicate
	}

	override matches(Object object) {
		predicate.apply(object as T)
	}

	override describeTo(Description description) {
		description.appendValue(predicate)
	}

	def static <T> org.hamcrest.Matcher<T> is((T)=>boolean predicate) {
		return new IsPredicateMatcher<T>(predicate)
	}

}