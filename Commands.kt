package parking

enum class Commands(val string: String) {
    CREATE("create"),
    EXIT("exit"),
    LEAVE("leave"),
    PARK("park"),
    STATUS("status");

    companion object {
        fun getCommand(input: String): Commands {
            for (command in Commands.values()) {
                if (command.string == input) return command
            }
            throw RuntimeException("Wrong command $input")
        }
    }
}