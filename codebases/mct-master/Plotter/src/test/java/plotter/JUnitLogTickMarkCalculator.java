/*******************************************************************************
 * Mission Control Technologies, Copyright (c) 2009-2012, United States Government
 * as represented by the Administrator of the National Aeronautics and Space 
 * Administration. All rights reserved.
 *
 * The MCT platform is licensed under the Apache License, Version 2.0 (the 
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations under 
 * the License.
 *
 * MCT includes source code licensed under additional open source licenses. See 
 * the MCT Open Source Licenses file included with this distribution or the About 
 * MCT Licenses dialog available at runtime from the MCT Help menu for additional 
 * information. 
 *******************************************************************************/
package plotter;

import java.util.Arrays;

import junit.framework.TestCase;

public class JUnitLogTickMarkCalculator extends TestCase {
	public void testExact() {
		double[][] data = ticks(1, 10);
		check(data[0], 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
		check(data[1], 1.0, 1.3010299956639813, 1.4771212547196624, 1.6020599913279625, 1.6989700043360187, 1.7781512503836436, 1.845098040014257,
				1.9030899869919435, 1.9542425094393248, 2.0, 2.3010299956639813, 2.4771212547196626, 2.6020599913279625, 2.6989700043360187,
				2.778151250383644, 2.845098040014257, 2.9030899869919438, 2.9542425094393248, 3.0, 3.3010299956639813, 3.4771212547196626,
				3.6020599913279625, 3.6989700043360187, 3.778151250383644, 3.845098040014257, 3.9030899869919438, 3.9542425094393248, 4.0,
				4.301029995663981, 4.477121254719663, 4.6020599913279625, 4.698970004336019, 4.778151250383644, 4.845098040014257, 4.903089986991944,
				4.954242509439325, 5.0, 5.301029995663981, 5.477121254719663, 5.6020599913279625, 5.698970004336019, 5.778151250383644,
				5.845098040014257, 5.903089986991944, 5.954242509439325, 6.0, 6.301029995663981, 6.477121254719663, 6.6020599913279625,
				6.698970004336019, 6.778151250383644, 6.845098040014257, 6.903089986991944, 6.954242509439325, 7.0, 7.301029995663981,
				7.477121254719663, 7.6020599913279625, 7.698970004336019, 7.778151250383644, 7.845098040014257, 7.903089986991944, 7.954242509439325,
				8.0, 8.301029995663981, 8.477121254719663, 8.602059991327963, 8.698970004336019, 8.778151250383644, 8.845098040014257,
				8.903089986991944, 8.954242509439325, 9.0, 9.301029995663981, 9.477121254719663, 9.602059991327963, 9.698970004336019,
				9.778151250383644, 9.845098040014257, 9.903089986991944, 9.954242509439325, 10.0);
	}


	public void testLess() {
		double[][] data = ticks(1.01, 9.99);
		check(data[0], 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
		check(data[1], 1.3010299956639813, 1.4771212547196624, 1.6020599913279625, 1.6989700043360187, 1.7781512503836436, 1.845098040014257,
				1.9030899869919435, 1.9542425094393248, 2.0, 2.3010299956639813, 2.4771212547196626, 2.6020599913279625, 2.6989700043360187,
				2.778151250383644, 2.845098040014257, 2.9030899869919438, 2.9542425094393248, 3.0, 3.3010299956639813, 3.4771212547196626,
				3.6020599913279625, 3.6989700043360187, 3.778151250383644, 3.845098040014257, 3.9030899869919438, 3.9542425094393248, 4.0,
				4.301029995663981, 4.477121254719663, 4.6020599913279625, 4.698970004336019, 4.778151250383644, 4.845098040014257, 4.903089986991944,
				4.954242509439325, 5.0, 5.301029995663981, 5.477121254719663, 5.6020599913279625, 5.698970004336019, 5.778151250383644,
				5.845098040014257, 5.903089986991944, 5.954242509439325, 6.0, 6.301029995663981, 6.477121254719663, 6.6020599913279625,
				6.698970004336019, 6.778151250383644, 6.845098040014257, 6.903089986991944, 6.954242509439325, 7.0, 7.301029995663981,
				7.477121254719663, 7.6020599913279625, 7.698970004336019, 7.778151250383644, 7.845098040014257, 7.903089986991944, 7.954242509439325,
				8.0, 8.301029995663981, 8.477121254719663, 8.602059991327963, 8.698970004336019, 8.778151250383644, 8.845098040014257,
				8.903089986991944, 8.954242509439325, 9.0, 9.301029995663981, 9.477121254719663, 9.602059991327963, 9.698970004336019,
				9.778151250383644, 9.845098040014257, 9.903089986991944, 9.954242509439325);
	}


	public void testMore() {
		double[][] data = ticks(.99, 10.01);
		check(data[0], 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
		check(data[1], 1.0, 1.3010299956639813, 1.4771212547196624, 1.6020599913279625, 1.6989700043360187, 1.7781512503836436, 1.845098040014257,
				1.9030899869919435, 1.9542425094393248, 2.0, 2.3010299956639813, 2.4771212547196626, 2.6020599913279625, 2.6989700043360187,
				2.778151250383644, 2.845098040014257, 2.9030899869919438, 2.9542425094393248, 3.0, 3.3010299956639813, 3.4771212547196626,
				3.6020599913279625, 3.6989700043360187, 3.778151250383644, 3.845098040014257, 3.9030899869919438, 3.9542425094393248, 4.0,
				4.301029995663981, 4.477121254719663, 4.6020599913279625, 4.698970004336019, 4.778151250383644, 4.845098040014257, 4.903089986991944,
				4.954242509439325, 5.0, 5.301029995663981, 5.477121254719663, 5.6020599913279625, 5.698970004336019, 5.778151250383644,
				5.845098040014257, 5.903089986991944, 5.954242509439325, 6.0, 6.301029995663981, 6.477121254719663, 6.6020599913279625,
				6.698970004336019, 6.778151250383644, 6.845098040014257, 6.903089986991944, 6.954242509439325, 7.0, 7.301029995663981,
				7.477121254719663, 7.6020599913279625, 7.698970004336019, 7.778151250383644, 7.845098040014257, 7.903089986991944, 7.954242509439325,
				8.0, 8.301029995663981, 8.477121254719663, 8.602059991327963, 8.698970004336019, 8.778151250383644, 8.845098040014257,
				8.903089986991944, 8.954242509439325, 9.0, 9.301029995663981, 9.477121254719663, 9.602059991327963, 9.698970004336019,
				9.778151250383644, 9.845098040014257, 9.903089986991944, 9.954242509439325, 10.0);
	}


	public void testExactInverted() {
		double[][] data = ticks(10, 1);
		check(data[0], 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
		check(data[1], 1.0, 1.3010299956639813, 1.4771212547196624, 1.6020599913279625, 1.6989700043360187, 1.7781512503836436, 1.845098040014257,
				1.9030899869919435, 1.9542425094393248, 2.0, 2.3010299956639813, 2.4771212547196626, 2.6020599913279625, 2.6989700043360187,
				2.778151250383644, 2.845098040014257, 2.9030899869919438, 2.9542425094393248, 3.0, 3.3010299956639813, 3.4771212547196626,
				3.6020599913279625, 3.6989700043360187, 3.778151250383644, 3.845098040014257, 3.9030899869919438, 3.9542425094393248, 4.0,
				4.301029995663981, 4.477121254719663, 4.6020599913279625, 4.698970004336019, 4.778151250383644, 4.845098040014257, 4.903089986991944,
				4.954242509439325, 5.0, 5.301029995663981, 5.477121254719663, 5.6020599913279625, 5.698970004336019, 5.778151250383644,
				5.845098040014257, 5.903089986991944, 5.954242509439325, 6.0, 6.301029995663981, 6.477121254719663, 6.6020599913279625,
				6.698970004336019, 6.778151250383644, 6.845098040014257, 6.903089986991944, 6.954242509439325, 7.0, 7.301029995663981,
				7.477121254719663, 7.6020599913279625, 7.698970004336019, 7.778151250383644, 7.845098040014257, 7.903089986991944, 7.954242509439325,
				8.0, 8.301029995663981, 8.477121254719663, 8.602059991327963, 8.698970004336019, 8.778151250383644, 8.845098040014257,
				8.903089986991944, 8.954242509439325, 9.0, 9.301029995663981, 9.477121254719663, 9.602059991327963, 9.698970004336019,
				9.778151250383644, 9.845098040014257, 9.903089986991944, 9.954242509439325, 10.0);
	}


	public void testLessInverted() {
		double[][] data = ticks(9.99, 1.01);
		check(data[0], 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
		check(data[1], 1.3010299956639813, 1.4771212547196624, 1.6020599913279625, 1.6989700043360187, 1.7781512503836436, 1.845098040014257,
				1.9030899869919435, 1.9542425094393248, 2.0, 2.3010299956639813, 2.4771212547196626, 2.6020599913279625, 2.6989700043360187,
				2.778151250383644, 2.845098040014257, 2.9030899869919438, 2.9542425094393248, 3.0, 3.3010299956639813, 3.4771212547196626,
				3.6020599913279625, 3.6989700043360187, 3.778151250383644, 3.845098040014257, 3.9030899869919438, 3.9542425094393248, 4.0,
				4.301029995663981, 4.477121254719663, 4.6020599913279625, 4.698970004336019, 4.778151250383644, 4.845098040014257, 4.903089986991944,
				4.954242509439325, 5.0, 5.301029995663981, 5.477121254719663, 5.6020599913279625, 5.698970004336019, 5.778151250383644,
				5.845098040014257, 5.903089986991944, 5.954242509439325, 6.0, 6.301029995663981, 6.477121254719663, 6.6020599913279625,
				6.698970004336019, 6.778151250383644, 6.845098040014257, 6.903089986991944, 6.954242509439325, 7.0, 7.301029995663981,
				7.477121254719663, 7.6020599913279625, 7.698970004336019, 7.778151250383644, 7.845098040014257, 7.903089986991944, 7.954242509439325,
				8.0, 8.301029995663981, 8.477121254719663, 8.602059991327963, 8.698970004336019, 8.778151250383644, 8.845098040014257,
				8.903089986991944, 8.954242509439325, 9.0, 9.301029995663981, 9.477121254719663, 9.602059991327963, 9.698970004336019,
				9.778151250383644, 9.845098040014257, 9.903089986991944, 9.954242509439325);
	}


	public void testMoreInverted() {
		double[][] data = ticks(10.01, .99);
		check(data[0], 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
		check(data[1], 1.0, 1.3010299956639813, 1.4771212547196624, 1.6020599913279625, 1.6989700043360187, 1.7781512503836436, 1.845098040014257,
				1.9030899869919435, 1.9542425094393248, 2.0, 2.3010299956639813, 2.4771212547196626, 2.6020599913279625, 2.6989700043360187,
				2.778151250383644, 2.845098040014257, 2.9030899869919438, 2.9542425094393248, 3.0, 3.3010299956639813, 3.4771212547196626,
				3.6020599913279625, 3.6989700043360187, 3.778151250383644, 3.845098040014257, 3.9030899869919438, 3.9542425094393248, 4.0,
				4.301029995663981, 4.477121254719663, 4.6020599913279625, 4.698970004336019, 4.778151250383644, 4.845098040014257, 4.903089986991944,
				4.954242509439325, 5.0, 5.301029995663981, 5.477121254719663, 5.6020599913279625, 5.698970004336019, 5.778151250383644,
				5.845098040014257, 5.903089986991944, 5.954242509439325, 6.0, 6.301029995663981, 6.477121254719663, 6.6020599913279625,
				6.698970004336019, 6.778151250383644, 6.845098040014257, 6.903089986991944, 6.954242509439325, 7.0, 7.301029995663981,
				7.477121254719663, 7.6020599913279625, 7.698970004336019, 7.778151250383644, 7.845098040014257, 7.903089986991944, 7.954242509439325,
				8.0, 8.301029995663981, 8.477121254719663, 8.602059991327963, 8.698970004336019, 8.778151250383644, 8.845098040014257,
				8.903089986991944, 8.954242509439325, 9.0, 9.301029995663981, 9.477121254719663, 9.602059991327963, 9.698970004336019,
				9.778151250383644, 9.845098040014257, 9.903089986991944, 9.954242509439325, 10.0);
	}


	private void check(double[] actual, double... expected) {
		Arrays.sort(actual);
		Arrays.sort(expected);
		String msg = "Expected " + Arrays.toString(expected) + ", but got " + Arrays.toString(actual);
		assertEquals(msg, expected.length, actual.length);
		for(int i = 0; i < expected.length; i++) {
			assertTrue(msg, Math.abs(expected[i] - actual[i]) < .0000001);
		}
	}


	private double[][] ticks(double start, double end) {
		LogTickMarkCalculator c = new LogTickMarkCalculator();
		Axis axis = new Axis() {
			private static final long serialVersionUID = 1L;

			@Override
			public String getTimeSystemAxisLabelName() {
				// TODO Auto-generated method stub
				return "GMT";
			}

			@Override
			public void setTimeSystemAxisLabelName(String labelName) {
				// TODO Auto-generated method stub
				
			}
		};
		axis.setStart(start);
		axis.setEnd(end);
		return c.calculateTickMarks(axis);
	}
}
