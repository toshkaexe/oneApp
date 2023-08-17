FROM ubuntu:latest
LABEL authors="anton_zeltser"

ENTRYPOINT ["top", "-b"]