#!/usr/bin/env bash

echo 'Deployment in process'
pwd && cd target
sudo systemctl stop grizzly-item.service || true
sudo rm /etc/init.d/grizzly-item || true
sudo ln -s grizzlystore-item-0.0.1-SNAPSHOT.jar /etc/init.d/grizzly-item
sudo systemctl start grizzly-item.service