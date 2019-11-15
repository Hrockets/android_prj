package com.example.bluetooth_demo.connect;

public class Constant {
    public static final String CONNECTTION_UUID = "00001101-0000-1000-8000-00805F9B34FB";

    /**
     * 开始监听
     */
    public static final int MSG_START_LISTENING = 1;

    /**
     * 结束监听
     */
    public static final int MSG_FINISH_LISTENING = 2;

    /**
     * 有客户端连接
     */
    public static final int MSG_GOT_A_CLINET = 3;

    /**
     * 连接到服务器
     */
    public static final int MSG_CONNECTED_TO_SERVER = 4;

    /**
     * 获取到数据
     */
    public static final int MSG_GOT_DATA = 5;
    /*
     * 连接结束
     * */
    public static final int MSG_FINISH_CONNECTED = 6;
    /**
     * 出错
     */
    public static final int MSG_ERROR = -1;

    public static final int SERVER = 0;
    public static final int CLIENT = 1;
    public static final int UNKNOWN = -1;
}