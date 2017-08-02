package io.pello.cleancode.samples.solid.lsp.squareparadox;

public class Square extends Rectangle {

	@Override
	public void setHeight(int height) {
		this.height = height;
		width = height;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
		height = width;
	}

}
