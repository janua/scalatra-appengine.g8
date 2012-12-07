#!/bin/bash

DEV_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

if [ -e $DEV_DIR/../.git ]; then
  cp $DEV_DIR/pre-commit $DEV_DIR/../.git/hooks/
fi

. $DEV_DIR/appengine-install.sh

export SBT_BOOT_DIR=$HOME/.sbt/boot/

if [ ! -d "$SBT_BOOT_DIR" ]; then
  mkdir -p $SBT_BOOT_DIR
fi
