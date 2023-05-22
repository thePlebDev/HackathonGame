package com.elliottsoftware.hackathongame

//This file will load in the native library that holds all of our code
// and will also define the functions that will be found in the native library.
class GL2NILib {

    //THIS IS WHERE WE ACCESS THE NATIVE CODE.
    // ALL THE METHODS ARE GOING TO BE STATIC WITH THE EXTERAL C++ CODE
    companion object {
        external fun init()
        external fun step()

        // Used to load the 'hackathongame' library on application startup.
        /**
         * A native method that is implemented by the 'hackathongame' native library,
         * which is packaged with this application.
         */
        init {
            System.loadLibrary("hackathongame")
        }
    }

}