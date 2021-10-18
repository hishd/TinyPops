# Circular Popup Dialog
[![](https://jitpack.io/v/hishd/TinyPops.svg)](https://jitpack.io/#hishd/TinyPops)


Tiny Popup dialog for android which brings a Single action dialog & a Dual action dialog with a bunch of customizations.

### Screenshot
![](https://github.com/hishd/TinyPops/raw/master/images/popup.gif)

### Installation & Setup

------------

The easiest way to use CircularPopup is to add the android library to your projects dependencies.

Add the repository to your project build.gradle

##### Maven
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
add dependency,
```
<dependency>
	    <groupId>com.github.hishd</groupId>
	    <artifactId>TinyPops</artifactId>
	    <version>1.0</version>
	</dependency>
```

##### Gradle

```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
add the dependency,
```
dependencies {
	        implementation 'com.github.hishd:TinyPops:1.0'
	}
```

## Usage

#### Show single action dialog
```
TinyPopups tinyPopupsSingleDialog = new TinyPopups(this)
                //This will create a Single Action Dialog
                .createSingleActionDialog()
                //Setting to TRUE will dismiss the popup when selected outside
                .setCancelledOnOutside(false)
                //Set the dialog Title
                .setTitle("Single Dialog")
                //Set the dialog Caption
                .setMessage("This is a simple single action dialog with a single button")
                //Set the dialog background color
                .setBackgroundColor(R.color.white)
                //Set the dialog title color
                .setTitleColor(R.color.black)
                //Set the dialog message color
                .setMessageColor(R.color.black)
                //Set the dialog Button 1 caption
                .setBtn1Caption("Action 1")
                //Set the dialog Button 1 Color
                .setBtn1Color( R.color.purple_700)
                //Set the dialog Button 1 caption color
                .setBtn1CaptionColor(R.color.white)
                //Setting TRUE will make all the button caption UPPERCASED
                .setBtn1AllCaps(false)
                //Set the action to the Button 1
                .setBtn1Action(dialog -> {
                    dialog.dismiss();
                });
                
    tinyPopupsSingleDialog.show();
```
#### Show dual action dialog
```
TinyPopups tinyPopupsDualDialog = new TinyPopups(this)
                //This will create a Dual Action Dialog
                .createDualActionDialog()
                //Setting to TRUE will dismiss the popup when selected outside
                .setCancelledOnOutside(false)
                //Set the dialog Title
                .setTitle("Single Dialog")
                //Set the dialog Caption
                .setMessage("This is a simple dual action dialog with a dual buttons.")
                //Set the dialog background color
                .setBackgroundColor(R.color.white)
                //Set the dialog title color
                .setTitleColor(R.color.black)
                //Set the dialog message color
                .setMessageColor(R.color.black)
                //Set the dialog Button 1 caption
                .setBtn1Caption("Action 1")
                //Set the dialog Button 1 Color
                .setBtn1Color(R.color.purple_700)
                //Set the dialog Button 1 caption color
                .setBtn1CaptionColor(R.color.white)
                //Setting TRUE will make all the button caption UPPERCASED
                .setBtn1AllCaps(false)
                //Set the action to the Button 1
                .setBtn1Action(dialog -> {
                    dialog.dismiss();
                })
                //Set the dialog Button 2 caption
                .setBtn2Caption("Action 1")
                //Set the dialog Button 2 Color
                .setBtn2Color(R.color.purple_700)
                //Set the dialog Button 2 caption color
                .setBtn2CaptionColor(R.color.white)
                //Setting TRUE will make all the button caption UPPERCASED
                .setBtn2AllCaps(false)
                //Set the action to the Button 2
                .setBtn2Action(dialog -> {
                    dialog.dismiss();
                });
    tinyPopupsDualDialog.show();
```


###### Please Refer the Sample project for more information.

