FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

inherit deploy

SRC_URI_append = " \
    file://0001-plymouth-systemd-append.patch \
    file://0002-plymouth-default-theme-is-resin.patch \
    file://resin-logo.png \
    file://resin.script \
    file://resin.plymouth \
    "

# install our theme, and remove some extra files to save a significant
# amount of space
do_install_append() {
    rm -r ${D}${sysconfdir}/plymouth # we use /usr/share/plymouth, not /etc/plymouth
    install -d ${D}${datadir}/plymouth/themes/resin
    install -m 644 ${WORKDIR}/resin.script ${D}${datadir}/plymouth/themes/resin/
    install -m 644 ${WORKDIR}/resin.plymouth ${D}${datadir}/plymouth/themes/resin/

    # Don't stop splash at boot
    rm ${D}${systemd_unitdir}/system/multi-user.target.wants/plymouth-quit.service
    rm ${D}${systemd_unitdir}/system/multi-user.target.wants/plymouth-quit-wait.service
}

do_deploy() {
    install ${WORKDIR}/resin-logo.png ${DEPLOYDIR}/resin-logo.png
}

# by setting a logo we avoid installing the default one
LOGO = "/mnt/boot/splash/resin-logo.png"

PACKAGES_remove = "${PN}-initrd"
PACKAGECONFIG = ""
RDEPENDS_${PN} = "bash"

addtask deploy before do_package after do_install
