package eu.moonwriters.bettervelocitylib.command

import com.velocitypowered.api.command.Command
import com.velocitypowered.api.command.CommandManager

class CommandHelper(
    private val plugin: Any,
    private val commandManager: CommandManager
) {

    fun registerCommand(name: String, command: Command, vararg aliases: String?) {
        commandManager.register(
            commandManager.metaBuilder(name)
                .aliases(*aliases)
                .plugin(plugin)
                .build(),
            command
        )
    }
}