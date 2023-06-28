package parking

enum class Commands(val string: String) {
    PARK("park"), LEAVE("leave"), EXIT("exit");

    companion object {
        fun getCommand(input: String): Commands {
            for (command in Commands.values()) {
                if (command.string == input) return command
            }
            throw RuntimeException("Wrong command $input")
        }
    }
}