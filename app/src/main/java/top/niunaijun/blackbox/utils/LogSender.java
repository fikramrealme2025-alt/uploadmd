package top.niunaijun.blackbox.utils;

import java.io.File;

/**
 * Dinonaktifkan: versi asli NewBlackbox mengunggah logcat + info perangkat
 * ke server pihak ketiga (logs-sender-api.vercel.app). Di SUNGKRAM tidak ada
 * pengiriman data apa pun keluar perangkat.
 */
public class LogSender {
    public static String send(String chatId, File logFile, String caption) {
        return "Log upload dinonaktifkan";
    }
}
