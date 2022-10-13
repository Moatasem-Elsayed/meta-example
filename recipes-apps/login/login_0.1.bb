# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
S="${WORKDIR}" 
SRC_URI = "file://login.tar "
#file://widget.h
DEPENDS += "qtbase wayland"
# NOTE: unable to map the following CMake package dependencies: Qt QT
inherit cmake
inherit cmake_qt5
# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
# FILES:login-src="main.cpp widget.cpp"
do_install(){
   install -d ${D}${sbindir}
	install -m 0755 ${WORKDIR}/build/login_system ${D}${sbindir}/login_system

    # install -d ${D}${docdir}
	# install -m 0644 ${WORKDIR}/widget.h ${D}${docdir}
}


