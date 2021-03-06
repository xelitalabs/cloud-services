#!/usr/bin/env bash
docker_build () {
    echo "building "$1
    build_dir=$current_dir"/"$1
    echo $1" dir is:" $build_dir
    cd $build_dir && mvn docker:build
}

docker_build_all () {
    docker_build "discovery-management"
    docker_build "configuration-management"
}

current_dir=$(pwd)
echo "current_dir is:" $current_dir

docker_build_all
