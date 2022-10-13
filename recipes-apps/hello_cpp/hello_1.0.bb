# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=0835ade698e0bcf8506ecda2f7b4f302"
#file:///home/moatasem/poky/meta-mycustom/recipes-application/hello/files/hello.tar.xz
SRC_URI = "file://hello.cpp \
	file://COPYING \
	"

# SRC_URI:append = " file://hello.service "
# inherit systemd
# SYSTEMD_AUTO_ENABLE = "enable"
# SYSTEMD_SERVICE:${PN} = "hello.service"
# FILES:${PN} += "${systemd_unitdir}/system/hello.service"
# FILES:${PN} = "${libdir}/* ${includedir}"
#file://0001-second.patch 
# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.
S = "${WORKDIR}"
do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	#oe_runmake
	${CXX} hello.cpp ${LDFLAGS} -o hellocpp
}

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
	install -d ${D}${sbindir}
	install -m 0755 hellocpp ${D}${sbindir}/hellocpp
	# install -d ${D}${systemd_unitdir}/system
  	# install -m 0644 ${WORKDIR}/hello.service ${D}${systemd_unitdir}/system
}

# do_install:append() {

# }