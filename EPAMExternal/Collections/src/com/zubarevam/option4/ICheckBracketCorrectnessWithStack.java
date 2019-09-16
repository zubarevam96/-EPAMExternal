package com.zubarevam.option4;

import com.zubarevam.Option;

public interface ICheckBracketCorrectnessWithStack extends Option {
    Boolean execute(String s);
}
//Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
//Проверить правильность расстановки скобок. Использовать стек.