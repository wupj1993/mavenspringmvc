/*
 * Copyright (c) 2015 / 8 / 13 10 :36 :16
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.common.uploadFile;

import java.io.OutputStream;
import java.io.IOException;

public class MonitoredOutputStream extends OutputStream {
	private OutputStream target;

	private OutputStreamListener listener;

	public MonitoredOutputStream(OutputStream target,
			OutputStreamListener listener) {
		this.target = target;
		this.listener = listener;
	}

	public void write(byte b[], int off, int len) throws IOException {
		target.write(b, off, len);
		listener.bytesRead(len - off);
	}

	public void write(byte b[]) throws IOException {
		target.write(b);
		listener.bytesRead(b.length);
	}

	public void write(int b) throws IOException {
		target.write(b);
		listener.bytesRead(1);
	}

	public void close() throws IOException {
		target.close();
	}

	public void flush() throws IOException {
		target.flush();
	}
}
