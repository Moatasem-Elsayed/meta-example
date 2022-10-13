# Base this image on core-image-base
include recipes-core/images/core-image-base.bb

# Only allow for machines which start with "rpi"
COMPATIBLE_MACHINE = "^rpi$"

inherit populate_sdk_qt5
IMAGE_INSTALL +=" rsync lftp"

# User configuration
inherit extrausers
EXTRA_USERS_PARAMS = "\
usermod -p \\\$1\\\$8uiksjhr\\\$dGcSUTCMLX0Tl1Benl3SX. root \
"

# Customize hostname
hostname_pn-base-files = "moatasem"

# Configure timezone
IMAGE_INSTALL += "tzdata-europe tzdata"

# install kernel modules
IMAGE_INSTALL += "kernel-modules"

# Only produce the "rpi-sdimg" image format
IMAGE_FSTYPES = "rpi-sdimg"
# Remove old builds
RM_OLD_IMAGE = "1"

# Customize the splash screen or disable
#SPLASH = "psplash-raspberrypi"
#IMAGE_FEATURES += "splash"
IMAGE_FEATURES_remove = "splash"

# Add ssh
IMAGE_FEATURES += "ssh-server-dropbear"

# Add package management
IMAGE_FEATURES += "package-management"
IMAGE_INSTALL += "opkg"

# Print this message when
do_image_complete_append() {
    bb.warn("The image has been freshly baked!")
}

# Install watchdog
IMAGE_INSTALL += "watchdog"

# Add support for wifi and bluetooth
IMAGE_INSTALL += "linux-firmware-bcm43430"

# Add mount.nfs
IMAGE_INSTALL += "nfs-utils"


# Use Network Manager
IMAGE_INSTALL += "networkmanager networkmanager-bash-completion networkmanager-nmtui"

# Install i2c-tools
IMAGE_INSTALL += "i2c-tools"

# Install picocom
IMAGE_INSTALL += "picocom"

# Add our packagegroup contains all user applications 
IMAGE_INSTALL += "packagegroup-myapp"

# Add our python flask hello world app
# IMAGE_INSTALL += "python-flask-hello-world"

# Add cpp hello world app
# IMAGE_INSTALL += "cpp-hello-world"

# Install cmake hello world 
# IMAGE_INSTALL += "cmake-hello-world"

# PACKAGECONFIG_remove_pn-qttools = "qtwebkit"
# PACKAGECONFIG_remove_pn-qtquick1 = "qtwebkit"

# Install qt5 cinematic experience app
# IMAGE_INSTALL += "cinematicexperience"
#qt5
IMAGE_INSTALL += "qtquickcontrols qtquickcontrols2"
IMAGE_INSTALL += " qtbase-tools qtbase qtdeclarative qtimageformats qtmultimedia qtquickcontrols2 qtquickcontrols qtbase-plugins  liberation-fonts"

#sound for Qt

IMAGE_INSTALL_append = " gstreamer1.0-plugins-good gstreamer1.0-plugins-base gstreamer1.0-plugins-ugly"
LICENSE_FLAGS_WHITELIST_append = " commercial  commercial_gstreamer1.0-plugins-ugly commercial_gstreamer1.0-plugins-ugly"
PACKAGECONFIG_append_pn-qtmultimedia = " gstreamer alsa"

IMAGE_INSTALL +=" omxplayer  "

### Audio Streaming ###
DISTRO_FEATURES_append = " pulseaudio"
IMAGE_INSTALL_append = " pulseaudio pulseaudio-module-dbus-protocol pulseaudio-server pulseaudio-module-bluetooth-discover pulseaudio-module-bluetooth-policy pulseaudio-module-bluez5-device pulseaudio-module-bluez5-discover alsa-utils alsa-plugins"
IMAGE_ROOTFS_EXTRA_SPACE = "502880"

IMAGE_REMOVE += " python-flask-hello-world_git"


### Video ###
HDMI_GROUP = "1"
HDMI_MODE = "4"