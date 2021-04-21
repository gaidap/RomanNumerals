package de.pac.test

import spock.lang.Specification

class MyFirstTest extends Specification {

    void 'My first test' () {
        expect:
        2 == 2
    }
}
