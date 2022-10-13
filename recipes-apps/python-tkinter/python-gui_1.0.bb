# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "file://tkwelcome.py \
"

S = "${WORKDIR}"

RDEPENDS_${PN} = "python3 python3-tkinter"


do_install () {
    # Install the python script
    install -m 0755 -d "${D}${bindir}"
    install -m 0755 tkwelcome.py "${D}${bindir}"
}

