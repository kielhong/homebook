__author__ = 'kiel'

import urllib2
import re


def read_html(url):
    response = urllib2.urlopen(url)

    return unicode(response.read(), "euc-kr").encode("utf-8")


def parse_html(html):
    book = {}

    book["title"] = parse_title(html)
    book["author"] = parse_author(html)
    book["publisher"] = parse_publisher(html)
    book["isbn"] = parse_isbn(html)

    return book


def parse_title(html):
    m = re.search("<span class=\"cname\">\s*</span>\s*<h1><a href.*?>(.*)</a></h1>", html, re.S);

    return m.group(1)


def parse_author(html):

    return ""



def parse_publisher(html):


    return ""



def parse_isbn(html):
    m = re.search("<dt>ISBN-13</dt>.*?<dd class=\"isbn10\"><p>(.*?)</p>", html, re.S);

    return m.group(1)



urls = ["http://www.yes24.com/24/Goods/20520429"]

for url in urls:
    html = read_html(url)
    book = parse_html(html)
    #print html
    print book

    print "INSERT INTO book (title, isbn) VALUES ('%(title)s','%(isbn)s')" % book



