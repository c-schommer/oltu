[![Build Status](https://travis-ci.org/pawelniewie/oltu.svg?branch=trunk)](https://travis-ci.org/pawelniewie/oltu)

# Apache Oltu

Apache Oltu is an OAuth protocol implementation in Java. It also covers others "OAuth family" related implementations such as JWT, JWS and OpenID Connect

I don't think it's currently maintained but I needed a working version so scraped the github community to get the best forks and combine them.

There's a released version available as well, check [mvn-repo branch](https://github.com/pawelniewie/oltu/tree/mvn-repo) 

# Documentation

Looking for documentation? The best place where finding the latest up-to-date documentation is the [Wiki](https://cwiki.apache.org/confluence/display/OLTU/Documentation).

You might also find some useful information about OAuth in one of the [referenced books](https://oltu.apache.org/books.html)

Please help us on keeping the documentation updated! Every contribution is more than welcome!

Have a look also to [APIs documentation](https://oltu.apache.org/apidocs/index.html).

# Repo history

Forked from:

* https://github.com/apache/oltu/
* https://github.com/Tykvik/oltu/
* https://github.com/ef-labs/oltu/

# How to use it

Add this to your `pom.xml`:

```xml
<repository>
    <id>pawelniewie-oltu-mvn-repo</id>
    <url>https://raw.github.com/pawelniewie/oltu/mvn-repo/</url>
    <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
    </snapshots>
</repository>
```

```xml
<dependency>
    <groupId>org.apache</groupId>
    <artifactId>oltu</artifactId>
    <version>1.0.3-pawelniewie</version>
</dependency>
```

Check the current version in [mvn-repo branch](https://github.com/pawelniewie/oltu/tree/mvn-repo/com/pawelniewiadomski/oltu)