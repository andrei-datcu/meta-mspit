DESCRIPTION = "Lights controller"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/andrei-datcu/rpi-lights.git;branch=master"

S = "${WORKDIR}"

do_install() {
        install -d ${D}/www/pages/
        cp  git/* ${D}/www/pages/
	touch /dev/xmas
	echo "*--**--**--*" > /home/root/pattern
}

FILES_${PN} += "\
/www/pages/* \"
