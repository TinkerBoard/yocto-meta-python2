SUMMARY = "Screen-scraping library"
DESCRIPTION = "Beautiful Soup is a library that makes it easy to scrape \
information from web pages. It sits atop an HTML or XML parser, providing \
Pythonic idioms for iterating, searching, and modifying the parse tree."
HOMEPAGE = " https://www.crummy.com/software/BeautifulSoup/bs4"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=f2d38d8a40bf73fd4b3d16ca2e5882d1"

SRC_URI[md5sum] = "be03d778cf61cf6734a480e2010d6657"
SRC_URI[sha256sum] = "6135db2ba678168c07950f9a16c4031822c6f4aec75a65e0a97bc5ca09789931"

inherit pypi setuptools

RDEPENDS_${PN}_class-target = "\
    ${PYTHON_PN}-core \
    ${PYTHON_PN}-html5lib \
    ${PYTHON_PN}-lxml \
"

BBCLASSEXTEND = "native nativesdk"
