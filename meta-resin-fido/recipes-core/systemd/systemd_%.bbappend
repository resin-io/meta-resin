FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"

SRC_URI_append = " \
	file://0001-Don-t-run-specific-services-in-container.patch \
	file://0002-remove_systemd-getty-generator.patch \
	"

