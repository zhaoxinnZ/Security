package pers.ZX.Interfaces;

import org.jetbrains.annotations.NotNull;

public interface Recognizer {
    public static boolean isInteger(@NotNull Object o){
        if (o instanceof Integer){
            return true;
        }else return false;
    }

    public static boolean isString(@NotNull Object o){
        if (o instanceof String){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isBoolean(@NotNull Object o){
        if (o instanceof Boolean){
            return true;
        }else {
            return false;
        }
    }

}
