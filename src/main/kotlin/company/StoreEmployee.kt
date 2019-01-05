package company


class StoreEmployee(var name: String, val id: Int) {
    init {

    }

    override fun equals(other: Any?): Boolean {
        // check for structural equality

        if(other == null || other !is StoreEmployee) {
            return false
        }

        return name == other.name && id == other.id
    }

    override fun hashCode(): Int {
        return 1
    }
}