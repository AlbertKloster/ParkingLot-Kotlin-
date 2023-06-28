package parking

enum class Commands(val string: String) {
    CREATE("create"),
    EXIT("exit"),
    LEAVE("leave"),
    PARK("park"),
    REG_BY_COLOR("reg_by_color"),
    SPOT_BY_COLOR("spot_by_color"),
    SPOT_BY_REG("spot_by_reg"),
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