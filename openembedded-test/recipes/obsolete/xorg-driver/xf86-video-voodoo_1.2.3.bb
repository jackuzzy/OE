require xorg-driver-video.inc
DESCRIPTION = "X11 driver for Voodoo/Voodoo2"
DEPENDS += " xf86dgaproto"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "c164effcc839eca1fc1d43a42f4086db"
SRC_URI[archive.sha256sum] = "025d4d99ab19325b72417fadbb099c757412988f800c9511be3e2c3993ae29e9"
