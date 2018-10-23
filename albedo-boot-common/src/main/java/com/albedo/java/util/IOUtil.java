package com.albedo.java.util;

import org.apache.commons.io.IOUtils;

import java.io.Closeable;
import java.io.IOException;

public class IOUtil extends IOUtils {
    public static void closeSafe(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {
            // ignore
        }
    }
}
