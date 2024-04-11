# UnderBlocks

```text
依頼者: あか-AK 様
使用言語: Kotlin
形態: Bukkit (Paper) 1.20.x ~
```

## 仕様
プラグインで、コンフィグファイルを作成し、その中に以下のようなYaml (config.yml) がかけるようにする。
```yaml
1:
  block:
    - STONE
  command:
    - playsound entity.generic.explode ambient @s

2:
  block:
    - EMERALD_BLOCK
    - SNOW
  command:
    - give @s emerald

3:
  block:
    - DIAMOND_BLOCK
  command:
    - give @s diamond
    - give @s emerald
```
のようにし、プレイヤーが動いた時そのプレイヤーの下にあるブロックがblock:に入っているブロックにあったら、command:の中身が実行されるようになっています。
実行するのは動いたプレイヤー自身がExecuteする形になります。
また、雪 (Material: SNOW)も、歩いた場所という形ではできています。

## License

---

**MIT License.**

You may fork and use my project without notification, provided you adhere to the following conditions.

- Add a link to [this repository](https://github.com/hideko-dev/UnderBlocks)

> Check out [LICENSE](./LICENSE) for more detail.