require recipes-core/images/rpi-basic-image.bb

IMAGE_INSTALL += "lighttpd-module-cgi lighttpd-module-rewrite lighttpd-module-alias lighttpd-dev lighttpd-module-indexfile lighttpd-module-dirlisting lighttpd-module-access lighttpd-module-fastcgi lighttpd-module-accesslog lighttpd lighttpd-module-staticfile lighttpd-module-redirect"
IMAGE_INSTALL += "at cronie"
IMAGE_INSTALL += "python-datetime python-netserver python-subprocess"
IMAGE_INSTALL += "logrotate"
IMAGE_INSTALL += "procps"
