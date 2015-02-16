class HelloSpec extends spock.lang.Specification {
    def "length of salutations"() {
        expect:
        salute.size() == length

        where:
        salute | length
        "hola" | 4
        "au"   | 2
    }
}
