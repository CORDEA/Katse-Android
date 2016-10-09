package jp.cordea.katse;

/**
 * Created by cordea on 2016/10/09.
 */

public class Katse {

    public String getA() {
        return "a";
    }

    public String getB(boolean isUpper) {
        return isUpper ? "b".toUpperCase() : "b";
    }

}
