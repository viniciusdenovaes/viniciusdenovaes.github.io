# Markdown


Assim como o HTML, a linguagem `markdown` é uma linguagem de marcação, mas bem mais leve e mais fácil de ler e escrever.

A sintaxe de markdown consegue fazer as principais funcionalidades de HTML, mas não todas. Se você usar apenas markdown para escrever seu site, você poderá escrever muito (MUITO) mais rápido, e se precisar usar alguma funcionalidade que só tem em HTML, é só usar HTML onde você precisar.

Abaixo alguns comandos em markdown e seu efeito correspondente em HTML.

(tabela retirada da [wikipédia](https://en.wikipedia.org/wiki/Markdown))

<html>
<table class="wikitable">
<tbody><tr>
<th width="20%">Text using Markdown syntax
</th>
<th width="20%">Corresponding HTML produced by a Markdown processor
</th>
<th width="20%">Text viewed in a browser
</th></tr>
<tr valign="top">
<td>
<div class="mw-highlight mw-highlight-lang-md mw-content-ltr" dir="ltr"><pre><span></span><span class="gh">Heading</span>
<span class="gh">=======</span>

<span class="gu">Sub-heading</span>
<span class="gu">-----------</span>

<span class="gh"># Alternative heading</span>

<span class="gu">## Alternative sub-heading</span>

Paragraphs are separated
by a blank line.

Two spaces at the end of a line  
produce a line break.
</pre></div>
</td>
<td>
<div class="mw-highlight mw-highlight-lang-html mw-content-ltr" dir="ltr"><pre><span></span><span class="p">&lt;</span><span class="nt">h1</span><span class="p">&gt;</span>Heading<span class="p">&lt;/</span><span class="nt">h1</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">h2</span><span class="p">&gt;</span>Sub-heading<span class="p">&lt;/</span><span class="nt">h2</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">h1</span><span class="p">&gt;</span>Alternative heading<span class="p">&lt;/</span><span class="nt">h1</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">h2</span><span class="p">&gt;</span>Alternative sub-heading<span class="p">&lt;/</span><span class="nt">h2</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Paragraphs are separated
by a blank line.<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Two spaces at the end of a line<span class="p">&lt;</span><span class="nt">br</span> <span class="p">/&gt;</span>
produce a line break.<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>
</pre></div>
</td>
<td><div style="color: #000000; background: none; overflow: hidden; page-break-after: avoid; font-size: 1.8em; font-family: Georgia,Times,serif; margin-top: 1em; margin-bottom: 0.25em; line-height: 1.3; padding: 0; border-bottom: 1px solid #AAAAAA;">Heading</div>
<div style="color: #000000; background: none; overflow: hidden; page-break-after: avoid; font-size: 1.5em; font-family: Georgia,Times,serif; margin-top: 1em; margin-bottom: 0.25em; line-height: 1.3; padding: 0; border-bottom: 1px solid #AAAAAA;">Sub-heading</div>
<div style="color: #000000; background: none; overflow: hidden; page-break-after: avoid; font-size: 1.8em; font-family: Georgia,Times,serif; margin-top: 1em; margin-bottom: 0.25em; line-height: 1.3; padding: 0; border-bottom: 1px solid #AAAAAA;">Alternative heading</div>
<div style="color: #000000; background: none; overflow: hidden; page-break-after: avoid; font-size: 1.5em; font-family: Georgia,Times,serif; margin-top: 1em; margin-bottom: 0.25em; line-height: 1.3; padding: 0; border-bottom: 1px solid #AAAAAA;">Alternative sub-heading</div>
<p>Paragraphs are separated
by a blank line.
</p><p>Two spaces at the end of a line<br>
produce a line break.
</p>
</td></tr>
<tr>
<td><div class="mw-highlight mw-highlight-lang-md mw-content-ltr" dir="ltr"><pre><span></span>Text attributes <span class="ge">_italic_</span>, <span class="gs">**bold**</span>, <span class="sb">`monospace`</span>.

Horizontal rule:

<pre>---</pre>
</pre></div>
</td>
<td>
<div class="mw-highlight mw-highlight-lang-html mw-content-ltr" dir="ltr"><pre><span></span><span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Text attributes <span class="p">&lt;</span><span class="nt">em</span><span class="p">&gt;</span>italic<span class="p">&lt;/</span><span class="nt">em</span><span class="p">&gt;</span>, <span class="p">&lt;</span><span class="nt">strong</span><span class="p">&gt;</span>bold<span class="p">&lt;/</span><span class="nt">strong</span><span class="p">&gt;</span>, <span class="p">&lt;</span><span class="nt">code</span><span class="p">&gt;</span>monospace<span class="p">&lt;/</span><span class="nt">code</span><span class="p">&gt;</span>.<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Horizontal rule:<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">hr</span> <span class="p">/&gt;</span>
</pre></div>
</td>
<td>Text attributes <i>italic</i>, <b>bold</b>, <code>monospace</code>.<p class="mw-empty-elt"></p>
<p>Horizontal rule:
</p>
<hr>
</td></tr>
<tr>
<td><div class="mw-highlight mw-highlight-lang-md mw-content-ltr" dir="ltr"><pre><span></span>Bullet lists nested within numbered list:

<span class="w">  </span><span class="k">1.</span> fruits
<span class="w">     </span><span class="k">*</span><span class="w"> </span>apple
<span class="w">     </span><span class="k">*</span><span class="w"> </span>banana
<span class="w">  </span><span class="k">2.</span> vegetables
<span class="w">     </span><span class="k">-</span><span class="w"> </span>carrot
<span class="w">     </span><span class="k">-</span><span class="w"> </span>broccoli
</pre></div>
</td>
<td>
<div class="mw-highlight mw-highlight-lang-html mw-content-ltr" dir="ltr"><pre><span></span><span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Bullet lists nested within numbered list:<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">ol</span><span class="p">&gt;</span>
  <span class="p">&lt;</span><span class="nt">li</span><span class="p">&gt;</span>fruits <span class="p">&lt;</span><span class="nt">ul</span><span class="p">&gt;</span>
      <span class="p">&lt;</span><span class="nt">li</span><span class="p">&gt;</span>apple<span class="p">&lt;/</span><span class="nt">li</span><span class="p">&gt;</span>
      <span class="p">&lt;</span><span class="nt">li</span><span class="p">&gt;</span>banana<span class="p">&lt;/</span><span class="nt">li</span><span class="p">&gt;</span>
  <span class="p">&lt;/</span><span class="nt">ul</span><span class="p">&gt;&lt;/</span><span class="nt">li</span><span class="p">&gt;</span>
  <span class="p">&lt;</span><span class="nt">li</span><span class="p">&gt;</span>vegetables <span class="p">&lt;</span><span class="nt">ul</span><span class="p">&gt;</span>
      <span class="p">&lt;</span><span class="nt">li</span><span class="p">&gt;</span>carrot<span class="p">&lt;/</span><span class="nt">li</span><span class="p">&gt;</span>
      <span class="p">&lt;</span><span class="nt">li</span><span class="p">&gt;</span>broccoli<span class="p">&lt;/</span><span class="nt">li</span><span class="p">&gt;</span>
  <span class="p">&lt;/</span><span class="nt">ul</span><span class="p">&gt;&lt;/</span><span class="nt">li</span><span class="p">&gt;</span>
<span class="p">&lt;/</span><span class="nt">ol</span><span class="p">&gt;</span>
</pre></div>
</td>
<td>Bullet lists nested within numbered list:
<ol><li>fruits
<ul><li>apple</li>
<li>banana</li></ul></li>
<li>vegetables
<ul><li>carrot</li>
<li>broccoli</li></ul></li></ol>
</td></tr>
<tr>
<td><div class="mw-highlight mw-highlight-lang-md mw-content-ltr" dir="ltr"><pre><span></span>A [<span class="nt">link</span>](<span class="na">http://example.com</span>).

![<span class="nt">Image</span>](<span class="na">Icon-pictures.png "icon"</span>)

<span class="k">&gt; </span><span class="ge">Markdown uses email-style</span>
characters for blockquoting.
<span class="k">&gt;</span>
<span class="ge">&gt; Multiple paragraphs need to be prepended individually.</span>

Most inline &lt;abbr title="Hypertext Markup Language"&gt;HTML&lt;/abbr&gt; tags are supported.
</pre></div>
</td>
<td>
<div class="mw-highlight mw-highlight-lang-html mw-content-ltr" dir="ltr"><pre><span></span><span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>A <span class="p">&lt;</span><span class="nt">a</span> <span class="na">href</span><span class="o">=</span><span class="s">"http://example.com"</span><span class="p">&gt;</span>link<span class="p">&lt;/</span><span class="nt">a</span><span class="p">&gt;</span>.<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;&lt;</span><span class="nt">img</span> <span class="na">alt</span><span class="o">=</span><span class="s">"Image"</span> <span class="na">title</span><span class="o">=</span><span class="s">"icon"</span> <span class="na">src</span><span class="o">=</span><span class="s">"Icon-pictures.png"</span> <span class="p">/&gt;&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">blockquote</span><span class="p">&gt;</span>
<span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Markdown uses email-style characters for blockquoting.<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>
<span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Multiple paragraphs need to be prepended individually.<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>
<span class="p">&lt;/</span><span class="nt">blockquote</span><span class="p">&gt;</span>

<span class="p">&lt;</span><span class="nt">p</span><span class="p">&gt;</span>Most inline <span class="p">&lt;</span><span class="nt">abbr</span> <span class="na">title</span><span class="o">=</span><span class="s">"Hypertext Markup Language"</span><span class="p">&gt;</span>HTML<span class="p">&lt;/</span><span class="nt">abbr</span><span class="p">&gt;</span> tags are supported.<span class="p">&lt;/</span><span class="nt">p</span><span class="p">&gt;</span>
</pre></div>
</td>
<td>A <a rel="nofollow" class="external text" href="http://example.com/">link</a>.
<p><span class="mw-default-size" typeof="mw:File"><span title="icon"><img alt="Image" src="Icon-pictures.png" decoding="async" width="65" height="59" class="mw-file-element" data-file-width="65" data-file-height="59"></span></span>
</p>
<blockquote>
<p>Markdown uses email-style characters for blockquoting.
</p><p>Multiple paragraphs need to be prepended individually.
</p>
</blockquote>
<p>Most inline <abbr title="Hypertext Markup Language">HTML</abbr> tags are supported.
</p>
</td></tr></tbody></table>
</html>

### Exemplo de tabela

Para fazer uma tabela você pode usar

<pre>
| Nome      | Idade | Peso |
|:---:      |:---:  |:---: |
brutinho    |10     |5.5
oggi        |5      |3.8
pato donald |30     |12.1
francis     |7      |2.0
</pre>

Para ter o resultado

| Nome      | Idade | Peso |
|:---:      |:---:  |:---: |
brutinho    |10     |5.5
oggi        |5      |3.8
pato donald |30     |12.1
francis     |7      |2.0
