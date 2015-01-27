/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.notepad;

import android.net.Uri;
import android.provider.BaseColumns;

public final class NotePad {
	public static final String AUTHORITY = "com.google.provider.NotePad";

	// This class cannot be instantiated
	private NotePad() {
	}

	/**
	 * Notes table contract
	 */
	public static final class Notes implements BaseColumns {

		private Notes() {
		}

		public static final String TABLE_NAME = "notes";

		private static final String SCHEME = "content://";

		private static final String PATH_NOTES = "/notes";

		private static final String PATH_NOTE_ID = "/notes/";

		public static final int NOTE_ID_PATH_POSITION = 1;

		private static final String PATH_LIVE_FOLDER = "/live_folders/notes";

		public static final Uri CONTENT_URI = Uri.parse(SCHEME + AUTHORITY
				+ PATH_NOTES);

		public static final Uri CONTENT_ID_URI_BASE = Uri.parse(SCHEME
				+ AUTHORITY + PATH_NOTE_ID);

		public static final Uri CONTENT_ID_URI_PATTERN = Uri.parse(SCHEME
				+ AUTHORITY + PATH_NOTE_ID + "/#");

		public static final Uri LIVE_FOLDER_URI = Uri.parse(SCHEME + AUTHORITY
				+ PATH_LIVE_FOLDER);

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.note";

		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.note";

		public static final String DEFAULT_SORT_ORDER = "modified DESC";

		public static final String COLUMN_NAME_TITLE = "title";

		public static final String COLUMN_NAME_NOTE = "note";

		public static final String COLUMN_NAME_CREATE_DATE = "created";

		public static final String COLUMN_NAME_MODIFICATION_DATE = "modified";
	}
}
