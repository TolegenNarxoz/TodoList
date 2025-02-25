package com.xenia.todosimpleapp.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

object ObjectFirebase {
    val auth: FirebaseAuth
        get() = Firebase.auth
    val currentUser : FirebaseUser?
        get() = auth.currentUser
    val database : DatabaseReference
        get() = Firebase.database("https://todolist-e3f4a-default-rtdb.firebaseio.com/").reference
    val userUid : String?
        get() = currentUser?.uid
}