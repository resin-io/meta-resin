# Auto-Generated by cargo-bitbake 0.3.15
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get fatrw could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/fatrw/0.1.0"
SRC_URI += "git://git@github.com/balena-os/fatrw.git;protocol=ssh;nobranch=1"
SRCREV = "68c0b1f667e127bca30127b2b3d7ff133085a949"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aho-corasick/0.7.15 \
    crate://crates.io/anyhow/1.0.2 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/0.1.8 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/block-buffer/0.7.3 \
    crate://crates.io/block-padding/0.1.5 \
    crate://crates.io/byte-tools/0.3.1 \
    crate://crates.io/byteorder/1.3.4 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/2.33.0 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/digest/0.8.1 \
    crate://crates.io/env_logger/0.6.2 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/generic-array/0.12.4 \
    crate://crates.io/getrandom/0.2.6 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.125 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/md-5/0.8.0 \
    crate://crates.io/memchr/2.3.0 \
    crate://crates.io/opaque-debug/0.2.3 \
    crate://crates.io/path-absolutize/2.0.2 \
    crate://crates.io/path-dedot/2.0.5 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/rand/0.6.5 \
    crate://crates.io/rand_chacha/0.1.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_hc/0.1.0 \
    crate://crates.io/rand_isaac/0.1.1 \
    crate://crates.io/rand_jitter/0.1.4 \
    crate://crates.io/rand_os/0.1.3 \
    crate://crates.io/rand_pcg/0.1.2 \
    crate://crates.io/rand_xorshift/0.1.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.4.6 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/tempfile/3.0.5 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/typenum/1.15.0 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

SUMMARY = "Safe file read and write for FAT filesystems"
HOMEPAGE = "https://github.com/balena-os/fatrw.git"
LICENSE = "Apache-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include fatrw-${PV}.inc
include fatrw.inc
