# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   Documentation/process/license-rules.rst
#   Documentation/images/COPYING-logo
#   Documentation/scsi/LICENSE.FlashPoint
#   Documentation/translations/it_IT/process/license-rules.rst
#   Documentation/translations/zh_CN/process/license-rules.rst
#   Documentation/translations/zh_TW/process/license-rules.rst
#   drivers/net/LICENSE.SRC
#   drivers/net/wireless/marvell/libertas/LICENSE
#   tools/usb/usbip/COPYING
#   fs/jffs2/LICENCE
#   LICENSES/preferred/LGPL-2.1
#   LICENSES/preferred/GPL-2.0
#   LICENSES/preferred/LGPL-2.0
#   LICENSES/deprecated/GPL-1.0
#   include/linux/license.h
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


inherit kernel 
SRC_URI = "git://github.com/raspberrypi/linux.git;protocol=git;branch=rpi-5.15.y; \
	   file://defconfig "

# Modify these as desired
SRCREV = "${AUTOREV}"
KBUILD_DEFCONFIG_raspberrypi3-custom ?= "bcm2709_defconfig"

S = "${WORKDIR}/git"

