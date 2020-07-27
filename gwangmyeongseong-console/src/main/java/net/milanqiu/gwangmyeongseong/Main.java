package net.milanqiu.gwangmyeongseong;

import net.milanqiu.mimas.runtime.ExternalCommandMap;

/**
 * Main class.
 * <p>
 * Creation Date: 2020-07-26
 * @author Milan Qiu
 */
public class Main {

    public static void main(String[] args) {
        ExternalCommandMap commands = new ExternalCommandMap();
        commands.put("CommandFinished", () -> "input:"+args[2]+","+args[3]);
        commands.put("CommandException", () -> Integer.toString(1/0));
        commands.put("CommandFreezed", () -> { while (true); });

        try {
            commands.executeAndAnnounce(args);
        } catch (Exception e) {
            commands.announceHalted(args, e);
        }
    }
}
