package com.example.notekeeper

import android.provider.ContactsContract

class DataManager {
    var courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()
}