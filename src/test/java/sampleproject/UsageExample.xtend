package sampleproject

import static org.junit.Assert.assertThat
import static sampleproject.IsPredicateMatcher.is

class UsageExample {
	

	def void test1() {
		val SomeInterface someInterface = null
		assertThat(someInterface as SomeInterface, is[valid]) // <-- this compiles
	}

	def void test2() {
		val SomeInterface someInterface = null
		assertThat(someInterface, is[SomeInterface ifc | ifc.valid]) // <-- this compiles
	}

	def void test3() {
		val SomeInterface someInterface = null
		assertThat(someInterface, is[(it as SomeInterface).valid]) // <-- this compiles
	}

	def void test4() {
		val SomeInterface someInterface = null
		assertThat(someInterface, is[valid]) // <-- this doesn't compile
	}
}