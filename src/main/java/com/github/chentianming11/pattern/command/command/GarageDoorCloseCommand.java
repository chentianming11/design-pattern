package com.github.chentianming11.pattern.command.command;

import com.github.chentianming11.pattern.command.device.GarageDoor;
import lombok.AllArgsConstructor;

/**
 * 打开车库门命令对象
 * @author 陈添明
 * @date 2019/1/7
 */
@AllArgsConstructor
public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
