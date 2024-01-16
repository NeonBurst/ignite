package com.thermondo.ingnite

import android.content.Context
import com.google.ar.core.Config
import com.google.ar.core.Session

class ARSession(private val context: Context) {
    fun createSession(): Session { //TODO Create Session
        // Create a new ARCore session.
        var session: Session = Session(context)

        //session = Session(this)

        // Create a session config.
        val config = Config(session)

        // Do feature-specific operations here, such as enabling depth or turning on
        // support for Augmented Faces.

        // Configure the session.
        session.configure(config)

        return session

    }
}
