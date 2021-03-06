package com.amap.api.services.core;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: MD5 */
public class ab {
    public static String a(String str) {
        if (str != null) {
            return ae.c(c(str));
        }
        return null;
    }

    public static String a(byte[] bArr) {
        return ae.c(b(bArr));
    }

    public static String b(String str) {
        return ae.d(d(str));
    }

    private static byte[] b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable e) {
            ay.a(e, "MD5", "getMd5Bytes");
            e.printStackTrace();
            return null;
        } catch (Throwable e2) {
            ay.a(e2, "MD5", "getMd5Bytes1");
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] c(String str) {
        try {
            return e(str);
        } catch (Throwable e) {
            ay.a(e, "MD5", "getMd5Bytes");
            e.printStackTrace();
            return new byte[0];
        } catch (Throwable e2) {
            ay.a(e2, "MD5", "getMd5Bytes");
            e2.printStackTrace();
            return new byte[0];
        } catch (Throwable e22) {
            ay.a(e22, "MD5", "getMd5Bytes");
            e22.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] d(String str) {
        try {
            return e(str);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return new byte[0];
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return new byte[0];
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] e(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes("utf-8"));
        return instance.digest();
    }
}
