The mobile app needs to be processed before analysis. At this moment, the Violist cannot specify hotsopts. It only analysis the second parameter of Logger.reportString(String, String). The code of this function can be seen in our source code. All the tools in this folder is used in our project, we instrument the mobile app and add the Logger.reportString(String, String) for every non-constant string variables. 
