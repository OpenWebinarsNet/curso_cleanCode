package io.pello.cleancode.samples.solid.isp.switchsample;

public class Switch {
	public class Converter {
		public float convertPesetas (float euros) {
			return euros * 166.386f;
		}

		public float convertEuros (float pesetas) {
			return pesetas / 166.386f;
		}
	}
}
