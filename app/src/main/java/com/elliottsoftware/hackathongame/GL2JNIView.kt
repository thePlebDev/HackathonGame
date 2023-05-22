package com.elliottsoftware.hackathongame

import android.content.Context
import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10


class GL2JNIView(context: Context):GLSurfaceView(context) {

    init{
        setRenderer(Renderer())
    }



    private class Renderer: GLSurfaceView.Renderer{


        override fun onSurfaceChanged(p0: GL10?, p1: Int, p2: Int) {
           // TODO("Not yet implemented")
            //GL2JNILib.init(width, height);
        }

        override fun onDrawFrame(p0: GL10?) {
             GL2NILib.step();

        }

        override fun onSurfaceCreated(p0: GL10?, p1: EGLConfig?) {
            // Do nothing.
        }

    }


}