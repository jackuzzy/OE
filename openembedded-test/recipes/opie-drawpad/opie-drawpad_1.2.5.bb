require ${PN}.inc

SRC_URI = "http://sources.openembedded.org/opie-1.2.5-split_noncore_graphics_drawpad.tar.bz2;name=split_noncore_graphics_drawpad \
           http://sources.openembedded.org/opie-1.2.5-split_pics.tar.bz2;name=split_pics \
           http://sources.openembedded.org/opie-1.2.5-split_apps.tar.bz2;name=split_apps"
SRC_URI[split_noncore_graphics_drawpad.md5sum] = "f536cdac1371dc396d8dbea37fb74057"
SRC_URI[split_noncore_graphics_drawpad.sha256sum] = "05a3af17140c73c340596a2446e84364725c59c6927a367342e48cdb00a0d8e2"
SRC_URI[split_pics.md5sum] = "e9b68749d67295f7080a23e39b17335e"
SRC_URI[split_pics.sha256sum] = "0a7aab6d0bce04d6a9c257d768d8a1a481d38ba527d6e6e50723973789954b4a"
SRC_URI[split_apps.md5sum] = "c765d13427e4dc8ee396e4dfed2dbe73"
SRC_URI[split_apps.sha256sum] = "0fea454d8d286f7febc7449e4a06f73e941e8b22e9bab904a32e57f35479862a"
