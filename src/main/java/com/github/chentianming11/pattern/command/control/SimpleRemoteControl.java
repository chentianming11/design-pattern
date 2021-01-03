package com.github.chentianming11.pattern.command.control;

import com.github.chentianming11.pattern.command.command.Command;

/**
 * @author 陈添明
 * @date 2019/1/7
 */
public class SimpleRemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按钮被按下
     */
    public void buttonWasPressed(){
        command.execute();
    }
}
