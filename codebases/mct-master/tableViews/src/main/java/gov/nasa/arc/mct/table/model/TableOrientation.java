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
package gov.nasa.arc.mct.table.model;

/**
 * Defines the orientation, or reading-order, of a table,
 * either row-wise or column-wise. A table that represents
 * objects will usually have the objects be rows or columns,
 * and attributes of those objects form the other axis.
 */
public enum TableOrientation {

	/**
	 * The primary axis of the table is horizontal, with rows
	 * representing the objects in the table.
	 */
	ROW_MAJOR,
	
	/**
	 * The primary axis of the table is vertical, with columns
	 * representing the objects in the table.
	 */
	COLUMN_MAJOR
	
}
