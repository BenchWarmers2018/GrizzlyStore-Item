package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.benchwarmers.grads.grizzlystoreitem.repositories.CategoryRepository;

import java.util.ArrayList;

@Controller
@RequestMapping(path = "/test")
public class SeedController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(path="/seed") // Map ONLY GET Requests
    public @ResponseBody String addNewCategory () {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request


        Category c1 = new Category(1, "Art", "Fur all those with bearly any " +
                "artistic talent, we have your back!");
        Category c2 = new Category(2, "Clothing", "Never get caught bearly " +
                " dressed with one of our adorable bear pieces!");
        Category c3 = new Category(3, "Home and Living", "Have a bearly decorated " +
                "house? Never fear! We are here!");
        Category c4 = new Category(4, "Jewellery", "Show someone that you " +
                "can't bear to be without them with one of our lovely bear themed jewellery pieces!");
        Category c5 = new Category(5, "Technology", "If you can't bear to live " +
                "a life without technology or electronics, fill your void here!");
        Category c6 = new Category(6, "Toys", "Come and bear witness to the most" +
                " adorable collection of bear themed toys!");


        categoryRepository.save(c1);
        categoryRepository.save(c2);
        categoryRepository.save(c3);
        categoryRepository.save(c4);
        categoryRepository.save(c5);
        categoryRepository.save(c6);


        Item iA01 = new Item("Bear Silhouette Wood Plank Cutout ", "In sea vide nostrud, tantas consul argumentum an nec, no mel persecuti scripserit. Usu viderer docendi accommodare in, dolores repudiandae id vel. Eros principes et duo. Cu tollit putent theophrastus eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA01.jpg", 45.95, 0, 7, c1);
        Item iA02 = new Item( "Cute Panda Heart Painting Acrylic", "Ad sed rebum soluta, homero percipitur ius eu, cu nam integre feugiat. An nec unum voluptua complectitur, eleifend abhorreant ad est, ne tractatos honestatis vel. Qui te soluta laoreet, graeci aperiri singulis sea ei.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA02.jpg", 19.99, 25, 10, c1);
        Item iA03 = new Item( "Graphic Bear in Flowers Black and White Art", "In primis suavitate vim. Ornatus ceteros quo eu, hinc veri bonorum nam ex. Vis an malis labore prompta, populo recteque pro ea. Oratio eruditi ullamcorper id mea, eius labore in cum, ex quem eros evertitur cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA03.jpg", 21.95, 0, 12, c1);
        Item iA04 = new Item( "Beautiful Bear Silhouette Tree Landscape Painting", "Purto doctus at per. Illud graecis has et. Eu discere eligendi omittantur nec, duo an labitur eloquentiam, clita indoctum ex quo. Tota albucius et quo, mei wisi libris scribentur cu, dicam exerci sea eu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA04.jpg", 95.99, 0, 15, c1);
        Item iA05 = new Item( "Beautiful Bear Silhouette Barren Tree Landscape Painting", "Officiis pericula omittantur vim ut. Ne quo esse malorum ancillae, euismod recteque eum at. At ius percipit deterruisset, cum eu eirmod maluisset tincidunt. Audiam facilisi perfecto an est, sed natum omnes et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA05.jpg", 95.99, 30, 12, c1);
        Item iA06 = new Item( "Black Bear Canvas Encased in Wood", "Qui eu fabellas apeirian, mei ex omnium explicari. Nec ea veri equidem partiendo. Liber possim percipit no vis. Ea mea delicata theophrastus, ei est esse mutat.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA06.gif", 39.99, 0, 16, c1);
        Item iA07 = new Item( "Two Sleepy Black Bear Cubs Painting", "Accusamus disputationi definitionem nam ut, eum eu aperiam urbanitas voluptatum. Et reque iisque convenire duo, no nam vocibus alienum. His ut putant lobortis conceptam. Vim no dicant homero offendit, mutat probatus molestiae nam ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA07.jpg", 19.99, 20, 3, c1);
        Item iA08 = new Item( "Scott and Becky Two Cuddling Black Cubs Painting", "Id tempor inermis omittantur sed. Et usu tantas sapientem, sit te malis menandri prodesset. Quas volumus ancillae eam ad. Munere perpetua id quo, regione scriptorem ius ut, te augue soleat appellantur quo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA08.gif", 19.99, 0, 4, c1);
        Item iA09 = new Item( "Abstract Polar Bear Painting Canvas", "Ex has choro officiis antiopam, vel omnes partem cu. Porro elaboraret et sea. At has tollit tractatos. Ius unum modus percipit an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA09.jpg", 29.99, 0, 8, c1);
        Item iA10 = new Item( "Abstract Boy on Polar Bear Circle Canvas", "Epicuri concludaturque mei eu, sit etiam nemore pertinax id, vitae semper detraxit no eum. Convenire adolescens ad eum. Vis ne eius semper, ne unum ubique posidonium mel. Pri populo elaboraret constituam no, eu possim scribentur nec.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA10.jpg", 39.99, 0, 35, c1);
        Item iA11 = new Item("Mama Bear and Cub Acrylic Painting Canvas", "Modus detracto mediocrem est id, an euismod argumentum pro. Et appareat recteque facilisis cum, atqui sapientem honestatis an vix, cibo vidisse ei pri. An omnium recteque cum, duo ea quas fastidii, nec partem ancillae ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA11.jpg", 17.99,5, 23, c1);
        Item iA12 = new Item("Mystical Polar Bear Blue Backdrop Canvas", "Petentium consulatu definitionem vis no. Mel suas eripuit repudiare et, malorum labitur ex eam. No quot elaboraret est, ancillae mandamus pro cu. Eum amet molestie eu. An omnis nihil pri, vim no maiorum repudiare.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA12.jpg", 15.99, 10, 24, c1);
        Item iA13 = new Item("Claw Necklace Bear Acrylic Painting Canvas", "His no oporteat disputando. Reque splendide vis no. Dicant facete sit te. Habemus partiendo vituperata cu quo, invidunt sadipscing cotidieque ex quo. Mea eu alienum perfecto.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA13.jpg", 12.99, 0, 5, c1);
        Item iA14 = new Item( "Beautiful Brown Bear Catching Salmon Acrylic Painting", "Id civibus molestie singulis duo, tempor altera duo et. Est quod tollit latine ea, impetus vulputate sed ex. At legere electram sea, munere petentium dissentiet duo no. Ne cetero democritum nam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA14.jpg", 29.99, 25, 10, c1);
        Item iA15 = new Item( "Mama Bear Lounging with Cubs in Meadow Painting", "Usu ad cetero detracto. Posidonium concludaturque per cu. In vel audire quaeque philosophia, usu ne quas laudem platonem, in eos nostro dolorem. Per ut eruditi sensibus tractatos, mel prima rationibus complectitur ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA15.jpg", 16.99, 0, 12, c1);
        Item iA16 = new Item( "Abstract Three Eyed Bear Painting", "Liber lobortis rationibus at mel, assum commodo appellantur ex qui. Vis cibo nulla persecuti ei, pro an quas dicat inimicus. Habemus denique mandamus in mea. Vis ludus prompta expetendis te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA16.jpg", 18.99, 0, 15, c1);
        Item iA17 = new Item( "Cute Cartoon Panda Painting", "Nulla feugiat usu cu, eam et audiam laboramus intellegebat. Nec discere copiosae expetenda ad, per an nulla elaboraret. Justo solet oportere no cum. Possit forensibus at usu, cetero nostrum posidonium cum in, quodsi scripta perfecto te mei.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA17.jpeg", 11.99, 30, 12, c1);
        Item iA18 = new Item( "Black Bear Hunting Down River Painting", "In cum augue vulputate signiferumque. Ut nam solum dicit, esse facilisis aliquando nam te, quo alii disputationi mediocritatem ut. Vel ad tamquam gubergren, et probatus persequeris intellegebat eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA18.jpg", 45.00, 0, 16, c1);
        Item iA19 = new Item( "Black Bear on Forest Cliff Painting", "Dicit veniam percipit pro an, verterem gloriatur elaboraret pri in. Mei esse adhuc quaeque eu, mea te inermis patrioque disputationi, an affert ceteros sea. Dicam utamur deserunt mea id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA19.jpg", 45.00, 20, 3, c1);
        Item iA20 = new Item( "Mama Bear and Cub Play Through Dusk Painting", "Odio consulatu eos ea. An idque patrioque suscipiantur per. Vocent suscipiantur quo ea, id nam consul theophrastus. In facete aliquam usu, mea eu sint adipiscing. Placerat reformidans per in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA20.jpeg", 34.99, 0, 4, c1);
        Item iA21 = new Item( "Mama Bear and Cubs Frolicking in Meadow Painting", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id. Consul ridens nominavi vis ut, ex quis omittam persequeris mei, qui ex utinam audire.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA21.jpg", 34.99, 0, 8, c1);
        Item iA22 = new Item( "Black Bears Overlooking Cliff Acrylic Painting", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne, in tollit vidisse laoreet sea. Ei eam tempor fabellas.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA22.jpg", 18.99, 0, 35, c1);
        Item iA23 = new Item("Christmas Polar Bear Gazing at Snow Painting", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex. Nec falli aliquam delectus ne. Qui habemus elaboraret ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA23.jpg", 17.99,5, 23, c1);
        Item iA24 = new Item("A Polar Bear's Hug Painting", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi. Duo sumo singulis no, eos mazim legimus mandamus ex. Sumo invidunt ne eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA24.jpg", 44.45, 10, 24, c1);
        Item iA25 = new Item("Best Friend's Hug Painting", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in. Diam sadipscing ex sit, eu simul vocent elaboraret sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA25.jpg", 12.99, 0, 5, c1);
        Item iA26 = new Item( "Aurora Borealis Painting", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius. Usu amet antiopam an, ei pri enim laoreet dolores. Est et delectus instructior, ad amet alterum sed.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA26.jpg", 14.99, 25, 10, c1);
        Item iA27 = new Item( "Little Brown Bear Canvas", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis. Vim ei assum abhorreant, posse nostrum qualisque ea mel. Ex dicam adolescens qui, sit ei vidit modus forensibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA27.jpg", 19.99, 0, 12, c1);
        Item iA28 = new Item( "Brown Bear 1 September 2018 Painting", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in. Ad sea impetus maiorum, dictas efficiendi constituam sed ea, putent antiopam ea vix.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA28.jpg", 18.99, 0, 15, c1);
        Item iA29 = new Item( "Mama Bear Knows Best Painting", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus. Dolore tamquam propriae qui eu, per nonumy postea temporibus ex, eu nusquam antiopam inciderint pro.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA29.jpg", 21.00, 30, 12, c1);
        Item iA30 = new Item( "Rolly Polly Cub Painting", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant. Duo solet impetus laboramus ad, tale tractatos expetenda ei ius, te case utinam feugiat vel. Ne atqui utamur cum, mea purto tamquam id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA30.jpg", 19.99, 0, 16, c1);
        Item iA31 = new Item( "Lazy and Full Bear Canvas", "Eum ad ullum nominati, vim ne animal sententiae. Convenire philosophia pri ea. Cum summo homero suavitate eu, te magna viris scaevola pri. Ei eirmod blandit scripserit vix, vel cu summo sensibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA31.jpeg", 19.99, 20, 3, c1);
        Item iA32 = new Item( "Solemn Eyes Painting", "Mel eu quidam nostro. Mei at malorum aliquid delectus, eius posse integre has te. An mel idque legere, an per congue vocibus. Ius id nusquam eligendi offendit, usu tation sapientem te, ea eum nobis doming propriae.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA32.jpg", 26.95, 0, 4, c1);
        Item iA33 = new Item( "WaterColor Brown Bear Dripped Painting", "Persius fabulas mea an, ignota petentium gubergren ei has. Recteque intellegam mea ea. Consequat mediocritatem ne pri, sed eu meis posse appetere. Quo id veritus adipisci, quod insolens no nam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA33.jpg", 35.60, 0, 8, c1);
        Item iA34 = new Item( "Bear Caught in Rain WaterColor Painting", "Aeque postulant erroribus an eum, ad his solet intellegat. Ea oportere gloriatur dissentiunt mea, ex modus iisque quo, ei quo nostro commune verterem. Pri ignota postea voluptatum an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA34.jpg", 44.20, 0, 35, c1);
        Item iA35 = new Item("Hologgraphic WaterColor Bear Painting", "Ei eos clita definiebas, libris regione conceptam vel cu. Eos erant errem voluptatibus cu. Nec at probo possim delenit, eu velit iudico dissentiunt mel, sit dicit denique cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA35.jpg", 17.55,5, 23, c1);
        Item iA36 = new Item("The Gaze of a Predator Painting", "An amet admodum pri, ut vim numquam dissentiunt, in etiam iudico legimus mei. Qui utamur laboramus cotidieque cu, habeo convenire maluisset eam ne. Cu vis accusata tractatos dissentiunt.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA36.jpg", 25.00, 10, 24, c1);
        Item iA37 = new Item( "The Hug of a Mom Painting", "Laudem admodum periculis sea et, eos nostro tritani dolorum ut. No iusto doming appellantur pri, qui te audiam iriure suscipit. Melius facilisi usu et. Illum decore eu vix, nec illum accusam consetetur ex, an impedit placerat duo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA37.jpg", 20.00, 0, 16, c1);
        Item iA38 = new Item( "Textured Polar Bear in the Moonlight Print", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur. Ex mel antiopam contentiones, nam ea adhuc exerci dolore. Eum at iudico dictas, molestiae adversarium te sit.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA38.jpg", 19.99, 20, 3, c1);
        Item iA39 = new Item( "The Warmth of a Best Friend Painting", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut. Dicit vocibus at his, usu ad saepe option vulputate.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA39.jpg", 30.00, 0, 4, c1);
        Item iA40 = new Item( "Beach Times Painting", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in, mutat audiam imperdiet qui ad, te simul graecis democritum eum. Quo tantas dissentiunt et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA40.jpg", 32.95, 0, 8, c1);
        Item iA41 = new Item( "The Queen and Her Stead Painting", "Ius oblique perpetua an, in vix postea equidem laoreet, nec eu sonet diceret. Ferri dicant disputationi his ut, inermis patrioque mea te. Dicta invenire facilisis sea ut, ut cum mutat utroque inciderint. Id modo legimus nec.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA41.jpg", 31.00, 0, 35, c1);
        Item iA42 = new Item("Hangry Bear Print", "Ad qui dignissim adolescens comprehensam, cum elitr praesent an. Vocent invenire consetetur has ei. Cum utinam reprehendunt ex. Sit ex dicta sensibus, usu feugait accusata repudiare ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA42.jpg", 9.99,5, 23, c1);
        Item iA43 = new Item("The Call of Nature Painting", "Ad usu wisi fabulas torquatos, at salutandi interpretaris qui. Eum no affert nonumes. Sit ubique nusquam disputationi ut, dicunt legendos ne nec, nostrud molestie id usu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iA43.jpg", 44.00, 10, 24, c1);

        Item iC01 = new Item("White Fluffy Kids Onesie", "In sea vide nostrud, tantas consul argumentum an nec, no mel persecuti scripserit. Usu viderer docendi accommodare in, dolores repudiandae id vel. Eros principes et duo. Cu tollit putent theophrastus eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC01.jpg", 39.99, 0, 7, c2);
        Item iC02 = new Item( "Ranger Bear Toddler T-Shirt", "Ad sed rebum soluta, homero percipitur ius eu, cu nam integre feugiat. An nec unum voluptua complectitur, eleifend abhorreant ad est, ne tractatos honestatis vel. Qui te soluta laoreet, graeci aperiri singulis sea ei.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC02.jpg", 19.99, 25, 10, c2);
        Item iC03 = new Item( "Baby Bear Brown Bear Jumpsuit", "In primis suavitate vim. Ornatus ceteros quo eu, hinc veri bonorum nam ex. Vis an malis labore prompta, populo recteque pro ea. Oratio eruditi ullamcorper id mea, eius labore in cum, ex quem eros evertitur cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC03.jpg", 21.95, 0, 12, c2);
        Item iC04 = new Item( "I am 4 Months Old Baby Jumpsuit", "Purto doctus at per. Illud graecis has et. Eu discere eligendi omittantur nec, duo an labitur eloquentiam, clita indoctum ex quo. Tota albucius et quo, mei wisi libris scribentur cu, dicam exerci sea eu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC04.jpg", 21.95, 0, 15, c2);
        Item iC05 = new Item( "Cuddly Polka Dot Bear Dressing Gown", "Officiis pericula omittantur vim ut. Ne quo esse malorum ancillae, euismod recteque eum at. At ius percipit deterruisset, cum eu eirmod maluisset tincidunt. Audiam facilisi perfecto an est, sed natum omnes et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC05.jpg", 39.99, 30, 12, c2);
        Item iC06 = new Item( "Family Combo Bear T-Shirts", "Qui eu fabellas apeirian, mei ex omnium explicari. Nec ea veri equidem partiendo. Liber possim percipit no vis. Ea mea delicata theophrastus, ei est esse mutat.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC06.jpg", 99.99, 0, 16, c2);
        Item iC07 = new Item( "Cute Bear Onesie Adult Size", "Accusamus disputationi definitionem nam ut, eum eu aperiam urbanitas voluptatum. Et reque iisque convenire duo, no nam vocibus alienum. His ut putant lobortis conceptam. Vim no dicant homero offendit, mutat probatus molestiae nam ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC07.jpg", 69.99, 20, 3, c2);
        Item iC08 = new Item( "Tight Fit Knitwear Bear Onesie Adult Size", "Id tempor inermis omittantur sed. Et usu tantas sapientem, sit te malis menandri prodesset. Quas volumus ancillae eam ad. Munere perpetua id quo, regione scriptorem ius ut, te augue soleat appellantur quo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC08.jpg", 79.99, 0, 4, c2);
        Item iC09 = new Item( "Fluffly Faux Fur Bear Onesie", "Ex has choro officiis antiopam, vel omnes partem cu. Porro elaboraret et sea. At has tollit tractatos. Ius unum modus percipit an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC09.jpg", 59.99, 0, 8, c2);
        Item iC10 = new Item( "Light Brown Rilakkuma Kids Size Onesie", "Epicuri concludaturque mei eu, sit etiam nemore pertinax id, vitae semper detraxit no eum. Convenire adolescens ad eum. Vis ne eius semper, ne unum ubique posidonium mel. Pri populo elaboraret constituam no, eu possim scribentur nec.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC10.jpg", 39.99, 0, 35, c2);
        Item iC11 = new Item("Dark Brown Rilakkuma Kids Size Onesie", "Modus detracto mediocrem est id, an euismod argumentum pro. Et appareat recteque facilisis cum, atqui sapientem honestatis an vix, cibo vidisse ei pri. An omnium recteque cum, duo ea quas fastidii, nec partem ancillae ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC11.jpg", 39.99,5, 23, c2);
        Item iC12 = new Item("Teddy Bear Red Bow Onesie Adult Size", "Petentium consulatu definitionem vis no. Mel suas eripuit repudiare et, malorum labitur ex eam. No quot elaboraret est, ancillae mandamus pro cu. Eum amet molestie eu. An omnis nihil pri, vim no maiorum repudiare.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC12.png", 49.99, 10, 24, c2);
        Item iC13 = new Item("Winnie the Pooh Bear Kids Size Onesie", "His no oporteat disputando. Reque splendide vis no. Dicant facete sit te. Habemus partiendo vituperata cu quo, invidunt sadipscing cotidieque ex quo. Mea eu alienum perfecto.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC13.jpg", 29.99, 0, 5, c2);
        Item iC14 = new Item( "Baby Teddy Bear Furry Baby Onesie", "Id civibus molestie singulis duo, tempor altera duo et. Est quod tollit latine ea, impetus vulputate sed ex. At legere electram sea, munere petentium dissentiet duo no. Ne cetero democritum nam. Te nec viris dolore reprimique, ei diam tota cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC14.jpg", 35.99, 25, 10, c2);
        Item iC15 = new Item( "Pair Combo Toddler Fluffy Bear Baby Onsie", "Usu ad cetero detracto. Posidonium concludaturque per cu. In vel audire quaeque philosophia, usu ne quas laudem platonem, in eos nostro dolorem. Per ut eruditi sensibus tractatos, mel prima rationibus complectitur ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC15.jpg", 60.00, 0, 12, c2);
        Item iC16 = new Item( "Winnie the Pooh Bear Adult Onesie", "Liber lobortis rationibus at mel, assum commodo appellantur ex qui. Vis cibo nulla persecuti ei, pro an quas dicat inimicus. Habemus denique mandamus in mea. Vis ludus prompta expetendis te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC16.jpg", 69.99, 0, 15, c2);
        Item iC17 = new Item( "Fluffy Grey Bear Pawed Pocket Adult Onesie", "Nulla feugiat usu cu, eam et audiam laboramus intellegebat. Nec discere copiosae expetenda ad, per an nulla elaboraret. Justo solet oportere no cum. Possit forensibus at usu, cetero nostrum posidonium cum in, quodsi scripta perfecto te mei.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC17.jpg", 69.99, 30, 12, c2);
        Item iC18 = new Item( "Sleepy Cub Baby Jumpsuit", "In cum augue vulputate signiferumque. Ut nam solum dicit, esse facilisis aliquando nam te, quo alii disputationi mediocritatem ut. Vel ad tamquam gubergren, et probatus persequeris intellegebat eam. ",
                "http://bw.ausgrads.academy/images/grizzlystore/iC18.jpg", 29.00, 0, 16, c2);
        Item iC19 = new Item( "Hangry when Hungry Baby Jumpsuit", "Dicit veniam percipit pro an, verterem gloriatur elaboraret pri in. Mei esse adhuc quaeque eu, mea te inermis patrioque disputationi, an affert ceteros sea. Dicam utamur deserunt mea id. In elit eleifend ius, choro utroque cu mei. ",
                "http://bw.ausgrads.academy/images/grizzlystore/iC19.png", 25.00, 20, 3, c2);
        Item iC20 = new Item( "Full Zipup Bear Baby Jumpsuit", "Odio consulatu eos ea. An idque patrioque suscipiantur per. Vocent suscipiantur quo ea, id nam consul theophrastus. In facete aliquam usu, mea eu sint adipiscing. Placerat reformidans per in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC20.png", 34.99, 0, 4, c2);
        Item iC21 = new Item( "Baby Bear Blues Baby Jumpsuit", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id. Consul ridens nominavi vis ut, ex quis omittam persequeris mei, qui ex utinam audire.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC21.jpg", 34.99, 0, 8, c2);
        Item iC22 = new Item( "Bear or Llama Not Sure Baby Onesie", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne, in tollit vidisse laoreet sea. Ei eam tempor fabellas.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC22.jpg", 18.99, 0, 35, c2);
        Item iC23 = new Item("Rainy Day Blues Baby Onesie", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex. Nec falli aliquam delectus ne. Qui habemus elaboraret ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC23.jpg", 17.99,5, 23, c2);
        Item iC24 = new Item("Ranger Baby Bear Onesie", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi. Duo sumo singulis no, eos mazim legimus mandamus ex. Sumo invidunt ne eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC24.jpg", 24.99, 10, 24, c2);
        Item iC25 = new Item("Cola Polar Bear Zip Up Hoodie Jumpsuit Adult", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in. Diam sadipscing ex sit, eu simul vocent elaboraret sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC25.png", 45.00, 0, 5, c2);
        Item iC26 = new Item( "Splattered Kumamon Onesie Adult", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius. Usu amet antiopam an, ei pri enim laoreet dolores. Est et delectus instructior, ad amet alterum sed.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC26.jpg", 65.00, 25, 10, c2);
        Item iC27 = new Item( "Bear on Skates Baby Jumpsuit", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis. Vim ei assum abhorreant, posse nostrum qualisque ea mel. Ex dicam adolescens qui, sit ei vidit modus forensibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC27.jpeg", 19.99, 0, 12, c2);
        Item iC28 = new Item( "WaterColor Polar Bear Baby Jumpsuit", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in. Ad sea impetus maiorum, dictas efficiendi constituam sed ea, putent antiopam ea vix.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC28.jpeg", 39.99, 0, 15, c2);
        Item iC29 = new Item( "Yellow Happy Bear Kids Onesie", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus. Dolore tamquam propriae qui eu, per nonumy postea temporibus ex, eu nusquam antiopam inciderint pro.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC29.jpeg", 30.00, 30, 12, c2);
        Item iC30 = new Item( "Greetings Bear Baby Jumpsuit", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant. Duo solet impetus laboramus ad, tale tractatos expetenda ei ius, te case utinam feugiat vel. Ne atqui utamur cum, mea purto tamquam id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC30.jpg", 19.99, 0, 16, c2);
        Item iC31 = new Item( "White Bear Pawed Pockets Adult Onesie", "Eum ad ullum nominati, vim ne animal sententiae. Convenire philosophia pri ea. Cum summo homero suavitate eu, te magna viris scaevola pri. Ei eirmod blandit scripserit vix, vel cu summo sensibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC31.jpg", 49.99, 20, 3, c2);
        Item iC32 = new Item( "Polar Bear Hug Jumper Adult Size", "Mel eu quidam nostro. Mei at malorum aliquid delectus, eius posse integre has te. An mel idque legere, an per congue vocibus. Ius id nusquam eligendi offendit, usu tation sapientem te, ea eum nobis doming propriae. Et cum comprehensam necessitatibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC32.jpg", 26.95, 0, 4, c2);
        Item iC33 = new Item( "Baby Pink Bear Onesie", "Persius fabulas mea an, ignota petentium gubergren ei has. Recteque intellegam mea ea. Consequat mediocritatem ne pri, sed eu meis posse appetere. Quo id veritus adipisci, quod insolens no nam. Et eum equidem complectitur.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC33.jpg", 35.60, 0, 8, c2);
        Item iC34 = new Item( "Ranger Brown Bear Cap", "Aeque postulant erroribus an eum, ad his solet intellegat. Ea oportere gloriatur dissentiunt mea, ex modus iisque quo, ei quo nostro commune verterem. Pri ignota postea voluptatum an. No mutat timeam platonem duo, vel amet enim discere ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC34.jpg", 30.00, 0, 35, c2);
        Item iC35 = new Item("Brown Bear Earred Beanie", "Ei eos clita definiebas, libris regione conceptam vel cu. Eos erant errem voluptatibus cu. Nec at probo possim delenit, eu velit iudico dissentiunt mel, sit dicit denique cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC35.jpeg", 25.00,5, 23, c2);
        Item iC36 = new Item("Faux Fur Bear Earred Beanie", "An amet admodum pri, ut vim numquam dissentiunt, in etiam iudico legimus mei. Qui utamur laboramus cotidieque cu, habeo convenire maluisset eam ne. Cu vis accusata tractatos dissentiunt. Eum natum mollis labitur an, eam in suavitate moderatius.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC36.jpeg", 40.00, 10, 24, c2);
        Item iC37 = new Item( "Pom Pom Bear Beanie Brown", "Laudem admodum periculis sea et, eos nostro tritani dolorum ut. No iusto doming appellantur pri, qui te audiam iriure suscipit. Melius facilisi usu et. Illum decore eu vix, nec illum accusam consetetur ex, an impedit placerat duo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC37.jpg", 29.00, 0, 16, c2);
        Item iC38 = new Item( "Mama Little Baby Bear Combo T-Shirts", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur. Ex mel antiopam contentiones, nam ea adhuc exerci dolore. Eum at iudico dictas, molestiae adversarium te sit.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC38.jpg", 75.00, 20, 3, c2);
        Item iC39 = new Item( "National Park Foundation Bear Navy Cap", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut. Dicit vocibus at his, usu ad saepe option vulputate. Omnes soleat reformidans in eum, ipsum assentior sed ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC39.jpg", 35.00, 0, 4, c2);
        Item iC40 = new Item( "Bear Knitted Beanie", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in, mutat audiam imperdiet qui ad, te simul graecis democritum eum. Quo tantas dissentiunt et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC40.jpeg", 32.95, 0, 8, c2);
        Item iC41 = new Item( "Light Brown Bear Knitted Beanie", "Ius oblique perpetua an, in vix postea equidem laoreet, nec eu sonet diceret. Ferri dicant disputationi his ut, inermis patrioque mea te. Dicta invenire facilisis sea ut, ut cum mutat utroque inciderint. Id modo legimus nec.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC41.jpg", 20.00, 0, 35, c2);
        Item iC42 = new Item("National Park Foundation Bear Brown Cap No Text", "Ad qui dignissim adolescens comprehensam, cum elitr praesent an. Vocent invenire consetetur has ei. Cum utinam reprehendunt ex. Sit ex dicta sensibus, usu feugait accusata repudiare ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC42.jpg", 35.00,5, 23, c2);
        Item iC43 = new Item("Grey Blue Knitted Baby Beanie", "Ad usu wisi fabulas torquatos, at salutandi interpretaris qui. Eum no affert nonumes. Sit ubique nusquam disputationi ut, dicunt legendos ne nec, nostrud molestie id usu. Ei ius admodum similique voluptaria.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC43.jpeg", 25.00, 10, 24, c2);
        Item iC44 = new Item( "Nike Papa Bear Tan Cap", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id. Consul ridens nominavi vis ut, ex quis omittam persequeris mei, qui ex utinam audire.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC44.jpg", 34.99, 0, 8, c2);
        Item iC45 = new Item( "Bright White Knitted Bear Baby Beanie", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne, in tollit vidisse laoreet sea. Ei eam tempor fabellas.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC45.jpeg", 18.99, 0, 35, c2);
        Item iC46 = new Item("Two Combo Baby Bear Beanie Set", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex. Nec falli aliquam delectus ne. Qui habemus elaboraret ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC46.jpeg", 35.00,5, 23, c2);
        Item iC47 = new Item("Trails Stone Senset Cap", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi. Duo sumo singulis no, eos mazim legimus mandamus ex. Sumo invidunt ne eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC47.jpeg", 30.00, 10, 24, c2);
        Item iC48 = new Item("Bamboo weaved Bear Ear Cap", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in. Diam sadipscing ex sit, eu simul vocent elaboraret sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC48.png", 40.00, 0, 5, c2);
        Item iC49 = new Item( "Cute Tassel Bear Long Earred Beanie", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius. Usu amet antiopam an, ei pri enim laoreet dolores. Est et delectus instructior, ad amet alterum sed.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC49.jpg", 19.99, 25, 10, c2);
        Item iC50 = new Item( "Kumamon Black Cap Adult Size", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis. Vim ei assum abhorreant, posse nostrum qualisque ea mel. Ex dicam adolescens qui, sit ei vidit modus forensibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC50.jpg", 29.99, 0, 12, c2);
        Item iC51 = new Item( "Baby Beanie and Mittens Set", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in. Ad sea impetus maiorum, dictas efficiendi constituam sed ea, putent antiopam ea vix.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC51.jpg", 32.00, 0, 15, c2);
        Item iC52 = new Item( "Cute Bear Black and Tan Gloves", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus. Dolore tamquam propriae qui eu, per nonumy postea temporibus ex, eu nusquam antiopam inciderint pro.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC52.jpeg", 21.00, 30, 12, c2);
        Item iC53 = new Item( "Baby TeePee Bear Jumpsuit", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant. Duo solet impetus laboramus ad, tale tractatos expetenda ei ius, te case utinam feugiat vel. Ne atqui utamur cum, mea purto tamquam id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC53.jpg", 19.99, 0, 16, c2);
        Item iC54 = new Item( "Moschino Festive Bear Jumpsuit Beanie Bib Set", "Eum ad ullum nominati, vim ne animal sententiae. Convenire philosophia pri ea. Cum summo homero suavitate eu, te magna viris scaevola pri. Ei eirmod blandit scripserit vix, vel cu summo sensibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC54.jpg", 49.99, 20, 3, c2);
        Item iC55 = new Item( "Baby Pink Bear Welcome Set", "Mel eu quidam nostro. Mei at malorum aliquid delectus, eius posse integre has te. An mel idque legere, an per congue vocibus. Ius id nusquam eligendi offendit, usu tation sapientem te, ea eum nobis doming propriae.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC55.jpeg", 130.00, 0, 4, c2);
        Item iC56 = new Item( "Geometical Bear Adult Beanie", "Persius fabulas mea an, ignota petentium gubergren ei has. Recteque intellegam mea ea. Consequat mediocritatem ne pri, sed eu meis posse appetere. Quo id veritus adipisci, quod insolens no nam. Et eum equidem complectitur.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC56.jpg", 30.00, 0, 8, c2);
        Item iC57 = new Item( "I Love My Moschino Bear Beanie and Bib Set", "Aeque postulant erroribus an eum, ad his solet intellegat. Ea oportere gloriatur dissentiunt mea, ex modus iisque quo, ei quo nostro commune verterem. Pri ignota postea voluptatum an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC57.jpg", 50.00, 0, 35, c2);
        Item iC58 = new Item( "Baby Bear T-Shirt", "Ei eos clita definiebas, libris regione conceptam vel cu. Eos erant errem voluptatibus cu. Nec at probo possim delenit, eu velit iudico dissentiunt mel, sit dicit denique cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC58.jpg", 17.55,5, 23, c2);
        Item iC59 = new Item("Sailor Bear Blankie", "An amet admodum pri, ut vim numquam dissentiunt, in etiam iudico legimus mei. Qui utamur laboramus cotidieque cu, habeo convenire maluisset eam ne. Cu vis accusata tractatos dissentiunt. Eum natum mollis labitur an, eam in suavitate moderatius.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC59.jpg", 25.00, 10, 24, c2);
        Item iC60 = new Item( "Patterned Silhouetted Bear Hoodie", "Laudem admodum periculis sea et, eos nostro tritani dolorum ut. No iusto doming appellantur pri, qui te audiam iriure suscipit. Melius facilisi usu et. Illum decore eu vix, nec illum accusam consetetur ex, an impedit placerat duo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC60.jpg", 60.00, 0, 16, c2);
        Item iC61 = new Item( "Bear or Llama Not Sure Gloves Mittens", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur. Ex mel antiopam contentiones, nam ea adhuc exerci dolore. Eum at iudico dictas, molestiae adversarium te sit.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC61.jpg", 30.00, 20, 3, c2);
        Item iC62 = new Item( "Happy Bear Mittens Gloves", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut. Dicit vocibus at his, usu ad saepe option vulputate.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC62.jpg", 30.00, 0, 4, c2);
        Item iC63 = new Item( "Brown Bear Clawed Oven Mitts", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in, mutat audiam imperdiet qui ad, te simul graecis democritum eum. Quo tantas dissentiunt et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC63.jpg", 25.00, 0, 8, c2);
        Item iC64 = new Item( "Koala Bear Not A Real Bear Costume Gloves", "Ius oblique perpetua an, in vix postea equidem laoreet, nec eu sonet diceret. Ferri dicant disputationi his ut, inermis patrioque mea te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC64.jpg", 31.00, 0, 35, c2);
        Item iC65 = new Item("Moschino Peekaboo Bear Baby Set", "Ad qui dignissim adolescens comprehensam, cum elitr praesent an. Vocent invenire consetetur has ei. Cum utinam reprehendunt ex. Sit ex dicta sensibus, usu feugait accusata repudiare ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC65.jpg", 99.99,5, 23, c2);
        Item iC66 = new Item("Moschino Peekaboo Bear Toddler Set", "Ad usu wisi fabulas torquatos, at salutandi interpretaris qui. Eum no affert nonumes. Sit ubique nusquam disputationi ut, dicunt legendos ne nec, nostrud molestie id usu. Ei ius admodum similique voluptaria.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC66.jpg", 99.99, 10, 24, c2);
        Item iC67 = new Item( "Simple Sleeveless Baby Jumpsuit", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur. Ex mel antiopam contentiones, nam ea adhuc exerci dolore. Eum at iudico dictas, molestiae adversarium te sit.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC67.jpg", 35.00, 20, 3, c2);
        Item iC68 = new Item( "Fleece Bear House Slippers", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut. Dicit vocibus at his, usu ad saepe option vulputate.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC68.jpg", 25.00, 0, 4, c2);
        Item iC69 = new Item( "Floofy Super Warm Bear Socks", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in, mutat audiam imperdiet qui ad, te simul graecis democritum eum. Quo tantas dissentiunt et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC69.jpeg", 15.00, 0, 8, c2);
        Item iC70 = new Item( "Moschino Bear White and Grey Baby Jumpsuit Set", "Ius oblique perpetua an, in vix postea equidem laoreet, nec eu sonet diceret. Ferri dicant disputationi his ut, inermis patrioque mea te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iC70.jpg", 70.00, 0, 35, c2);



        Item iH01 = new Item("Gold Plated Bear Plate", "In sea vide nostrud, tantas consul argumentum an nec, no mel persecuti scripserit. Usu viderer docendi accommodare in, dolores repudiandae id vel. Eros principes et duo. Cu tollit putent theophrastus eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH01.jpg", 39.99, 0, 0, c3);
        Item iH02 = new Item( "Drunk Bears 3 Bottle Wine Holder", "Ad sed rebum soluta, homero percipitur ius eu, cu nam integre feugiat. An nec unum voluptua complectitur, eleifend abhorreant ad est, ne tractatos honestatis vel. Qui te soluta laoreet, graeci aperiri singulis sea ei.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH02.jpg", 49.99, 25, 0, c3);
        Item iH03 = new Item( "Prince George Birthday Mug", "In primis suavitate vim. Ornatus ceteros quo eu, hinc veri bonorum nam ex. Vis an malis labore prompta, populo recteque pro ea. Oratio eruditi ullamcorper id mea, eius labore in cum, ex quem eros evertitur cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH03.jpg", 20.00, 0, 0, c3);
        Item iH04 = new Item( "Bear Pine Scented Candle Gift", "Purto doctus at per. Illud graecis has et. Eu discere eligendi omittantur nec, duo an labitur eloquentiam, clita indoctum ex quo. Tota albucius et quo, mei wisi libris scribentur cu, dicam exerci sea eu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH04.jpg", 24.99, 0, 0, c3);
        Item iH05 = new Item( "CareBear Toy Box", "Officiis pericula omittantur vim ut. Ne quo esse malorum ancillae, euismod recteque eum at. At ius percipit deterruisset, cum eu eirmod maluisset tincidunt. Audiam facilisi perfecto an est, sed natum omnes et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH05.jpg", 39.99, 30, 0, c3);
        Item iH06 = new Item( "Hand Crafted Rustic Cottage Clock", "Qui eu fabellas apeirian, mei ex omnium explicari. Nec ea veri equidem partiendo. Liber possim percipit no vis. Ea mea delicata theophrastus, ei est esse mutat.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH06.png", 299.99, 0, 0, c3);
        Item iH07 = new Item( "Baby Bear Curtain Drapes", "Accusamus disputationi definitionem nam ut, eum eu aperiam urbanitas voluptatum. Et reque iisque convenire duo, no nam vocibus alienum. His ut putant lobortis conceptam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH07.jpeg", 30.00, 20, 0, c3);
        Item iH08 = new Item( "Bear Patterned Curtain Drapes", "Id tempor inermis omittantur sed. Et usu tantas sapientem, sit te malis menandri prodesset. Quas volumus ancillae eam ad. Munere perpetua id quo, regione scriptorem ius ut, te augue soleat appellantur quo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH08.jpg", 45.00, 0, 0, c3);
        Item iH09 = new Item( "Bare Bears Cutlery Set Spoon Fork and Holder", "Ex has choro officiis antiopam, vel omnes partem cu. Porro elaboraret et sea. At has tollit tractatos. Ius unum modus percipit an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH09.png", 29.99, 0, 0, c3);
        Item iH10 = new Item( "Hand Carved Stone Bear Lamp", "Epicuri concludaturque mei eu, sit etiam nemore pertinax id, vitae semper detraxit no eum. Convenire adolescens ad eum. Vis ne eius semper, ne unum ubique posidonium mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH10.jpg", 195.99, 0, 30, c3);
        Item iH11 = new Item("Bear Light Socket Cover Set of 10", "Modus detracto mediocrem est id, an euismod argumentum pro. Et appareat recteque facilisis cum, atqui sapientem honestatis an vix, cibo vidisse ei pri. An omnium recteque cum, duo ea quas fastidii, nec partem ancillae ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH11.jpg", 120.00,5, 0, c3);
        Item iH12 = new Item("Printed Mama Bear and Cubs Mug", "Petentium consulatu definitionem vis no. Mel suas eripuit repudiare et, malorum labitur ex eam. No quot elaboraret est, ancillae mandamus pro cu. Eum amet molestie eu. An omnis nihil pri, vim no maiorum repudiare.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH12.jpg", 19.99, 10, 0, c3);
        Item iH13 = new Item("Printed American Expedition Black Bear Mug", "His no oporteat disputando. Reque splendide vis no. Dicant facete sit te. Habemus partiendo vituperata cu quo, invidunt sadipscing cotidieque ex quo. Mea eu alienum perfecto.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH13.jpg", 19.99, 0, 0, c3);
        Item iH14 = new Item( "Canadian Polar Bear in a Snow Storm", "Id civibus molestie singulis duo, tempor altera duo et. Est quod tollit latine ea, impetus vulputate sed ex. At legere electram sea, munere petentium dissentiet duo no. Ne cetero democritum nam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH14.jpeg", 24.99, 25, 0, c3);
        Item iH15 = new Item( "Polar Bear Sees You Mug", "Usu ad cetero detracto. Posidonium concludaturque per cu. In vel audire quaeque philosophia, usu ne quas laudem platonem, in eos nostro dolorem. Per ut eruditi sensibus tractatos, mel prima rationibus complectitur ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH15.jpg", 19.00, 0, 0, c3);
        Item iH16 = new Item( "Polar Bear Facts Mug", "Liber lobortis rationibus at mel, assum commodo appellantur ex qui. Vis cibo nulla persecuti ei, pro an quas dicat inimicus. Habemus denique mandamus in mea. Vis ludus prompta expetendis te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH16.jpg", 19.99, 0, 0, c3);
        Item iH17 = new Item( "Light Grey Polar Bear Print Matching Quilt and Pillow Cover Set", "Nulla feugiat usu cu, eam et audiam laboramus intellegebat. Nec discere copiosae expetenda ad, per an nulla elaboraret. Justo solet oportere no cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH17.jpg", 145.99, 30, 0, c3);
        Item iH18 = new Item( "Happy Panda Bear Patterned Matching Quilt and Pillow Cover Set", "In cum augue vulputate signiferumque. Ut nam solum dicit, esse facilisis aliquando nam te, quo alii disputationi mediocritatem ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH18.jpg", 145.99, 0, 0, c3);
        Item iH19 = new Item( "Teddy Bear Patterned Matching Quilt and Pillow Cover Set", "Dicit veniam percipit pro an, verterem gloriatur elaboraret pri in. Mei esse adhuc quaeque eu, mea te inermis patrioque disputationi, an affert ceteros sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH19.jpg", 145.99, 20, 0, c3);
        Item iH20 = new Item( "Kumamon Bear Patterned Matching Quilt and Pillow Cover Set", "Odio consulatu eos ea. An idque patrioque suscipiantur per. Vocent suscipiantur quo ea, id nam consul theophrastus. In facete aliquam usu, mea eu sint adipiscing.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH20.jpg", 200.00, 0, 0, c3);
        Item iH21 = new Item( "Heavy Duty Grizzly Bear Rug", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id. Consul ridens nominavi vis ut, ex quis omittam persequeris mei, qui ex utinam audire.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH21.jpg", 150.99, 0, 0, c3);
        Item iH22 = new Item( "Black Bear Salt and Pepper Holder", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne, in tollit vidisse laoreet sea. Ei eam tempor fabellas.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH22.jpg", 34.99, 0, 0, c3);
        Item iH23 = new Item("Handmade Bear Soap", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex. Nec falli aliquam delectus ne. Qui habemus elaboraret ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH23.jpg", 24.99,5, 0, c3);
        Item iH24 = new Item("Black Bear Soap Dispenser", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi. Duo sumo singulis no, eos mazim legimus mandamus ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH24.jpg", 24.99, 10, 0, c3);
        Item iH25 = new Item("FamilyBear Stone Statue", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in. Diam sadipscing ex sit, eu simul vocent elaboraret sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH25.jpg", 15.99, 0, 0, c3);
        Item iH26 = new Item( "Cheerful Toilet Paper Bear Holder", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius. Usu amet antiopam an, ei pri enim laoreet dolores.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH26.jpg", 30.99, 25, 0, c3);
        Item iH27 = new Item( "Cheerful Toilet Paper Bear Storage", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis. Vim ei assum abhorreant, posse nostrum qualisque ea mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH27.gif", 19.99, 0, 0, c3);
        Item iH28 = new Item( "Bear Cutout Wind Charm", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in. Ad sea impetus maiorum, dictas efficiendi constituam sed ea, putent antiopam ea vix.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH28.jpg", 39.99, 0, 0, c3);
        Item iH29 = new Item( "Stone Bear Head Monument", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus. Dolore tamquam propriae qui eu, per nonumy postea temporibus ex, eu nusquam antiopam inciderint pro.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH29.jpg", 30.00, 30, 0, c3);
        Item iH30 = new Item( "Bear Styled Wall Socket Plug", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant. Duo solet impetus laboramus ad, tale tractatos expetenda ei ius, te case utinam feugiat vel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iH30.jpg", 19.99, 0, 0, c3);


        Item iJ01 = new Item("Bull and Bear Cufflinks", "In sea vide nostrud, tantas consul argumentum an nec, no mel persecuti scripserit. Usu viderer docendi accommodare in, dolores repudiandae id vel. Eros principes et duo. Cu tollit putent theophrastus eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ01.jpg", 39.99, 0, 7, c4);
        Item iJ02 = new Item( "Mama Bear and Cubs Silver and Gold Necklace", "Ad sed rebum soluta, homero percipitur ius eu, cu nam integre feugiat. An nec unum voluptua complectitur, eleifend abhorreant ad est, ne tractatos honestatis vel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ02.jpg", 19.99, 25, 10, c4);
        Item iJ03 = new Item( "Teddy Hug Charm", "In primis suavitate vim. Ornatus ceteros quo eu, hinc veri bonorum nam ex. Vis an malis labore prompta, populo recteque pro ea. Oratio eruditi ullamcorper id mea, eius labore in cum, ex quem eros evertitur cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ03.jpg", 21.95, 0, 12, c4);
        Item iJ04 = new Item( "Grizzly Bear Silver Charm", "Purto doctus at per. Illud graecis has et. Eu discere eligendi omittantur nec, duo an labitur eloquentiam, clita indoctum ex quo. Tota albucius et quo, mei wisi libris scribentur cu, dicam exerci sea eu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ04.jpg", 21.95, 0, 15, c4);
        Item iJ05 = new Item( "Bear Paw Silver Charm", "Officiis pericula omittantur vim ut. Ne quo esse malorum ancillae, euismod recteque eum at. At ius percipit deterruisset, cum eu eirmod maluisset tincidunt. Audiam facilisi perfecto an est, sed natum omnes et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ05.jpg", 15.99, 30, 12, c4);
        Item iJ06 = new Item( "Bear Flat Silver Head and Paw Accent Necklace", "Qui eu fabellas apeirian, mei ex omnium explicari. Nec ea veri equidem partiendo. Liber possim percipit no vis. Ea mea delicata theophrastus, ei est esse mutat.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ06.jpg", 19.99, 0, 16, c4);
        Item iJ07 = new Item( "Dancing Bear Charm", "Accusamus disputationi definitionem nam ut, eum eu aperiam urbanitas voluptatum. Et reque iisque convenire duo, no nam vocibus alienum. His ut putant lobortis conceptam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ07.jpg", 12.99, 20, 3, c4);
        Item iJ08 = new Item( "Hand Polished Bear Motif Stone Necklace", "Id tempor inermis omittantur sed. Et usu tantas sapientem, sit te malis menandri prodesset. Quas volumus ancillae eam ad. Munere perpetua id quo, regione scriptorem ius ut, te augue soleat appellantur quo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ08.jpg", 79.99, 0, 4, c4);
        Item iJ09 = new Item( "Titanium Bear Necklace", "Ex has choro officiis antiopam, vel omnes partem cu. Porro elaboraret et sea. At has tollit tractatos. Ius unum modus percipit an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ09.jpeg", 59.99, 0, 8, c4);
        Item iJ10 = new Item( "Sterling Silver Bear Charm", "Epicuri concludaturque mei eu, sit etiam nemore pertinax id, vitae semper detraxit no eum. Convenire adolescens ad eum. Vis ne eius semper, ne unum ubique posidonium mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ10.jpeg", 49.99, 0, 35, c4);
        Item iJ11 = new Item("Geometric Sterling Silver Gold or Silver Bear Necklace", "Modus detracto mediocrem est id, an euismod argumentum pro. Et appareat recteque facilisis cum, atqui sapientem honestatis an vix, cibo vidisse ei pri.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ11.jpg", 39.99,5, 23, c4);
        Item iJ12 = new Item("Sterling Siler Polar Bear Charm", "Petentium consulatu definitionem vis no. Mel suas eripuit repudiare et, malorum labitur ex eam. No quot elaboraret est, ancillae mandamus pro cu. Eum amet molestie eu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ12.jpg", 49.99, 10, 24, c4);
        Item iJ13 = new Item("Gold or Silver Star Silhouette Charm", "His no oporteat disputando. Reque splendide vis no. Dicant facete sit te. Habemus partiendo vituperata cu quo, invidunt sadipscing cotidieque ex quo. Mea eu alienum perfecto.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ13.jpg", 29.99, 0, 5, c4);
        Item iJ14 = new Item( "Black Bear Silver Necklace", "Id civibus molestie singulis duo, tempor altera duo et. Est quod tollit latine ea, impetus vulputate sed ex. At legere electram sea, munere petentium dissentiet duo no. Ne cetero democritum nam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ14.jpg", 35.99, 25, 10, c4);
        Item iJ15 = new Item( "12K Gold Bear Movable Limbs Charm", "Usu ad cetero detracto. Posidonium concludaturque per cu. In vel audire quaeque philosophia, usu ne quas laudem platonem, in eos nostro dolorem. Per ut eruditi sensibus tractatos, mel prima rationibus complectitur ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ15.jpg", 60.00, 0, 12, c4);
        Item iJ16 = new Item( "18K Teddy Bear Gold Charm", "Liber lobortis rationibus at mel, assum commodo appellantur ex qui. Vis cibo nulla persecuti ei, pro an quas dicat inimicus. Habemus denique mandamus in mea. Vis ludus prompta expetendis te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ16.jpeg", 69.99, 0, 15, c4);
        Item iJ17 = new Item( "Classic Flat Face Bear Silver Necklace", "Nulla feugiat usu cu, eam et audiam laboramus intellegebat. Nec discere copiosae expetenda ad, per an nulla elaboraret. Justo solet oportere no cum. Possit forensibus at usu..",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ17.jpg", 19.99, 30, 12, c4);
        Item iJ18 = new Item( "Origami Styled Bear Charm", "In cum augue vulputate signiferumque. Ut nam solum dicit, esse facilisis aliquando nam te, quo alii disputationi mediocritatem ut. Vel ad tamquam gubergren, et probatus persequeris intellegebat eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ18.jpg", 29.00, 0, 16, c4);
        Item iJ19 = new Item( "Bear Paw Earring Studs Surgical Steel", "Dicit veniam percipit pro an, verterem gloriatur elaboraret pri in. Mei esse adhuc quaeque eu, mea te inermis patrioque disputationi, an affert ceteros sea. Dicam utamur deserunt mea id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ19.jpg", 25.00, 20, 3, c4);
        Item iJ20 = new Item( "Mama Bear Jewelled Necklace", "Odio consulatu eos ea. An idque patrioque suscipiantur per. Vocent suscipiantur quo ea, id nam consul theophrastus. In facete aliquam usu, mea eu sint adipiscing. Placerat reformidans per in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ20.jpeg", 34.99, 0, 4, c4);
        Item iJ21 = new Item( "Sleepy Bear Loves Honey Gold Brooch", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id. Consul ridens nominavi vis ut, ex quis omittam persequeris mei, qui ex utinam audire.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ21.jpg", 34.99, 0, 8, c4);
        Item iJ22 = new Item( "Black Bear Printed Dangle Earrings", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne, in tollit vidisse laoreet sea. Ei eam tempor fabellas.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ22.jpg", 18.99, 0, 35, c4);
        Item iJ23 = new Item("Minimalistic Mountain Range Outline Necklace Gold", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex. Nec falli aliquam delectus ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ23.jpg", 37.99,5, 23, c4);
        Item iJ24 = new Item("Mama Bear Copper Dangle Earrings", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi. Duo sumo singulis no, eos mazim legimus mandamus ex. Sumo invidunt ne eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ24.jpg", 24.99, 10, 24, c4);
        Item iJ25 = new Item("Bedazzled Jewellery Holder", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in. Diam sadipscing ex sit, eu simul vocent elaboraret sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ25.jpg", 75.00, 0, 5, c4);
        Item iJ26 = new Item( "Glass Molded Teddy Holding Blue Heart Set", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius. Usu amet antiopam an, ei pri enim laoreet dolores.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ26.jpg", 35.00, 25, 10, c4);
        Item iJ27 = new Item( "Starred Mountain Range Sterling Silver Bear Earring Studs", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis. Vim ei assum abhorreant, posse nostrum qualisque ea mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ27.jpg", 39.99, 0, 12, c4);
        Item iJ28 = new Item( "Papa Bear and Cubs Engraved Charms", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in. Ad sea impetus maiorum, dictas efficiendi constituam sed ea, putent antiopam ea vix.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ28.jpg", 39.99, 0, 15, c4);
        Item iJ29 = new Item( "Mama Bear Customisable Bracelet", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus. Dolore tamquam propriae qui eu, per nonumy postea temporibus ex, eu nusquam antiopam inciderint pro.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ29.jpg", 33.00, 30, 12, c4);
        Item iJ30 = new Item( "Red Gummy Bear Earring Studs", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant. Duo solet impetus laboramus ad, tale tractatos expetenda ei ius, te case utinam feugiat vel. Ne atqui utamur cum, mea purto tamquam id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ30.jpg", 19.99, 0, 16, c4);
        Item iJ31 = new Item( "Bear Cub Brooch", "Eum ad ullum nominati, vim ne animal sententiae. Convenire philosophia pri ea. Cum summo homero suavitate eu, te magna viris scaevola pri. Ei eirmod blandit scripserit vix, vel cu summo sensibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ31.jpg", 12.00, 20, 3, c4);
        Item iJ32 = new Item( "Gold Plated Bear Earring Studs", "Mel eu quidam nostro. Mei at malorum aliquid delectus, eius posse integre has te. An mel idque legere, an per congue vocibus. Ius id nusquam eligendi offendit, usu tation sapientem te, ea eum nobis doming propriae.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ32.jpg", 26.95, 0, 4, c4);
        Item iJ33 = new Item( "Cute Teddy Bear Long Earring Studs", "Persius fabulas mea an, ignota petentium gubergren ei has. Recteque intellegam mea ea. Consequat mediocritatem ne pri, sed eu meis posse appetere. Quo id veritus adipisci, quod insolens no nam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ33.jpg", 35.60, 0, 8, c4);
        Item iJ34 = new Item( "Jewelled Bear Head Earring Studs", "Aeque postulant erroribus an eum, ad his solet intellegat. Ea oportere gloriatur dissentiunt mea, ex modus iisque quo, ei quo nostro commune verterem. Pri ignota postea voluptatum an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ34.jpg", 30.00, 0, 35, c4);
        Item iJ35 = new Item("Rustic Styled Bear Earring Studs", "Ei eos clita definiebas, libris regione conceptam vel cu. Eos erant errem voluptatibus cu. Nec at probo possim delenit, eu velit iudico dissentiunt mel, sit dicit denique cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ35.jpg", 25.00,5, 23, c4);
        Item iJ36 = new Item("Wooden Cabochon Bear Earring Studs", "An amet admodum pri, ut vim numquam dissentiunt, in etiam iudico legimus mei. Qui utamur laboramus cotidieque cu, habeo convenire maluisset eam ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ36.jpg", 40.00, 10, 24, c4);
        Item iJ37 = new Item( "Full Body Bear Earring Stud", "Laudem admodum periculis sea et, eos nostro tritani dolorum ut. No iusto doming appellantur pri, qui te audiam iriure suscipit. Melius facilisi usu et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ37.jpg", 29.00, 0, 16, c4);
        Item iJ38 = new Item( "Hand Carved Wooden Bear Head Pendant", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur. Ex mel antiopam contentiones, nam ea adhuc exerci dolore.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ38.jpg", 75.00, 20, 3, c4);
        Item iJ39 = new Item( "Bear Nom Nom Ring Sterling Silver", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ39.jpg", 35.00, 0, 4, c4);
        Item iJ40 = new Item( "Rustic Styled Bear PocketWatch Wind Up", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in, mutat audiam imperdiet qui ad, te simul graecis democritum eum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ40.jpg", 52.95, 0, 8, c4);
        Item iJ41 = new Item( "Silicon Panda Coin Purse", "Ius oblique perpetua an, in vix postea equidem laoreet, nec eu sonet diceret. Ferri dicant disputationi his ut, inermis patrioque mea te. Dicta invenire facilisis sea ut, ut cum mutat utroque inciderint.",
                "http://bw.ausgrads.academy/images/grizzlystore/iJ41.jpg", 10.00, 0, 35, c4);


        Item iT01 = new Item("Creepy Bear Mouse", "In sea vide nostrud, tantas consul argumentum an nec, no mel persecuti scripserit. Usu viderer docendi accommodare in, dolores repudiandae id vel. Eros principes et duo. Cu tollit putent theophrastus eam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT01.jpg", 39.99, 0, 7, c5);
        Item iT02 = new Item( "Moschino Pink Bear Phone Case IPhone", "Ad sed rebum soluta, homero percipitur ius eu, cu nam integre feugiat. An nec unum voluptua complectitur, eleifend abhorreant ad est, ne tractatos honestatis vel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT02.jpg", 19.99, 25, 10, c5);
        Item iT03 = new Item( "Polar Bear Electronic Scale", "In primis suavitate vim. Ornatus ceteros quo eu, hinc veri bonorum nam ex. Vis an malis labore prompta, populo recteque pro ea. Oratio eruditi ullamcorper id mea, eius labore in cum, ex quem eros evertitur cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT03.jpg", 21.95, 0, 12, c5);
        Item iT04 = new Item( "Wide Eyed Polar Bear Speaker for iOS", "Purto doctus at per. Illud graecis has et. Eu discere eligendi omittantur nec, duo an labitur eloquentiam, clita indoctum ex quo. Tota albucius et quo, mei wisi libris scribentur cu, dicam exerci sea eu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT04.jpg", 21.95, 0, 15, c5);
        Item iT05 = new Item( "Holographic Bear Earred Wireless Headphones", "Officiis pericula omittantur vim ut. Ne quo esse malorum ancillae, euismod recteque eum at. At ius percipit deterruisset, cum eu eirmod maluisset tincidunt.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT05.jpg", 60.00, 30, 12, c5);
        Item iT06 = new Item( "Rilakkuma Ear Bud Earphones", "Qui eu fabellas apeirian, mei ex omnium explicari. Nec ea veri equidem partiendo. Liber possim percipit no vis. Ea mea delicata theophrastus, ei est esse mutat.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT06.jpg", 30.00, 0, 16, c5);
        Item iT07 = new Item( "Blue Bear Earphones", "Accusamus disputationi definitionem nam ut, eum eu aperiam urbanitas voluptatum. Et reque iisque convenire duo, no nam vocibus alienum. His ut putant lobortis conceptam.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT07.jpg", 30.00, 20, 3, c5);
        Item iT08 = new Item( "Black Bear Earphones", "Id tempor inermis omittantur sed. Et usu tantas sapientem, sit te malis menandri prodesset. Quas volumus ancillae eam ad. Munere perpetua id quo, regione scriptorem ius ut, te augue soleat appellantur quo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT08.jpg", 30.00, 0, 4, c5);
        Item iT09 = new Item( "Pink Bear Earphones", "Ex has choro officiis antiopam, vel omnes partem cu. Porro elaboraret et sea. At has tollit tractatos. Ius unum modus percipit an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT09.jpg", 30.00, 0, 8, c5);
        Item iT10 = new Item( "Light Blue Bear Earphones", "Epicuri concludaturque mei eu, sit etiam nemore pertinax id, vitae semper detraxit no eum. Convenire adolescens ad eum. Vis ne eius semper, ne unum ubique posidonium mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT10.jpg", 30.00, 0, 35, c5);
        Item iT11 = new Item("Panda Bear NOPE PopSocket", "Modus detracto mediocrem est id, an euismod argumentum pro. Et appareat recteque facilisis cum, atqui sapientem honestatis an vix, cibo vidisse ei pri. An omnium recteque cum, duo ea quas fastidii, nec partem ancillae ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT11.jpg", 30.00,5, 23, c5);
        Item iT12 = new Item("Yellow Bear Earphones", "Petentium consulatu definitionem vis no. Mel suas eripuit repudiare et, malorum labitur ex eam. No quot elaboraret est, ancillae mandamus pro cu. Eum amet molestie eu. An omnis nihil pri, vim no maiorum repudiare.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT12.jpg", 25.00, 10, 24, c5);
        Item iT13 = new Item("Bejewelled Yellow Phone Dust Plug", "His no oporteat disputando. Reque splendide vis no. Dicant facete sit te. Habemus partiendo vituperata cu quo, invidunt sadipscing cotidieque ex quo. Mea eu alienum perfecto.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT13.jpg", 30.00, 0, 5, c5);
        Item iT14 = new Item( "White Bear Earphones", "Id civibus molestie singulis duo, tempor altera duo et. Est quod tollit latine ea, impetus vulputate sed ex. At legere electram sea, munere petentium dissentiet duo no.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT14.jpg", 35.99, 25, 10, c5);
        Item iT15 = new Item( "Holographic Bear Earred Wireless Headphones KIDS", "Usu ad cetero detracto. Posidonium concludaturque per cu. In vel audire quaeque philosophia, usu ne quas laudem platonem, in eos nostro dolorem.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT15.jpg", 60.00, 0, 12, c5);
        Item iT16 = new Item( "Bare Bears Earphones", "Liber lobortis rationibus at mel, assum commodo appellantur ex qui. Vis cibo nulla persecuti ei, pro an quas dicat inimicus. Habemus denique mandamus in mea. Vis ludus prompta expetendis te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT16.jpg", 30.00, 0, 15, c5);
        Item iT17 = new Item( "Bear Earphones 4 Colors Set", "Nulla feugiat usu cu, eam et audiam laboramus intellegebat. Nec discere copiosae expetenda ad, per an nulla elaboraret. Justo solet oportere no cum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT17.jpg", 100.00, 30, 12, c5);
        Item iT18 = new Item( "White Bear Earred Headphones Wireless", "In cum augue vulputate signiferumque. Ut nam solum dicit, esse facilisis aliquando nam te, quo alii disputationi mediocritatem ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT18.jpg", 60.00, 0, 16, c5);
        Item iT19 = new Item( "Creepy Panda HeadPhones", "Dicit veniam percipit pro an, verterem gloriatur elaboraret pri in. Mei esse adhuc quaeque eu, mea te inermis patrioque disputationi, an affert ceteros sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT19.jpg", 25.00, 20, 3, c5);
        Item iT20 = new Item( "Panda EarBud Earphones", "Odio consulatu eos ea. An idque patrioque suscipiantur per. Vocent suscipiantur quo ea, id nam consul theophrastus. In facete aliquam usu, mea eu sint adipiscing.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT20.jpg", 34.99, 0, 4, c5);
        Item iT21 = new Item( "White Bear Earphone Holder", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT21.jpeg", 9.99, 0, 8, c5);
        Item iT22 = new Item( "Polar Bear Earphone Holder", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne, in tollit vidisse laoreet sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT22.jpg", 9.99, 0, 35, c5);
        Item iT23 = new Item("Bare Bear Polar Bear Laptop Case 15inches", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT23.jpg", 17.99,5, 23, c5);
        Item iT24 = new Item("Kawaii Brown Bear Laptop Case 15inches", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT24.jpg", 24.99, 10, 24, c5);
        Item iT25 = new Item("Polar Bear and Cubs Laptop Case 15inches", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT25.jpg", 45.00, 0, 5, c5);
        Item iT26 = new Item( "Brown Bear Hug iPad Cover Case 15inches", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT26.jpeg", 65.00, 25, 10, c5);
        Item iT27 = new Item( "Black Bear in a Polar Bear Suit Laptop Case 15inches", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT27.jpg", 19.99, 0, 12, c5);
        Item iT28 = new Item( "Bare Bear Polar Bear Ninja Laptop Case 13inches", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT28.jpg", 39.99, 0, 15, c5);
        Item iT29 = new Item( "Polar Bear Hidden USB 64G", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT29.jpeg", 30.00, 30, 12, c5);
        Item iT30 = new Item( "Bare Bear Polar Bear Axe Laptop Case 13inches", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT30.jpg", 19.99, 0, 16, c5);
        Item iT31 = new Item( "Bare Bears 3 Bears Laptop Case 13inches", "Eum ad ullum nominati, vim ne animal sententiae. Convenire philosophia pri ea. Cum summo homero suavitate eu, te magna viris scaevola pri.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT31.jpg", 49.99, 20, 3, c5);
        Item iT32 = new Item( "Aesthetic Mountain Bear Silhouette Laptop Case 13inches", "Mel eu quidam nostro. Mei at malorum aliquid delectus, eius posse integre has te. An mel idque legere, an per congue vocibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT32.jpg", 26.95, 0, 4, c5);
        Item iT33 = new Item( "3 Bare Bears Blue Laptop Case 13inches", "Persius fabulas mea an, ignota petentium gubergren ei has. Recteque intellegam mea ea. Consequat mediocritatem ne pri, sed eu meis posse appetere.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT33.jpg", 35.60, 0, 8, c5);
        Item iT34 = new Item( "3 Bare Bears Stacked Laptop Case 13inches", "Aeque postulant erroribus an eum, ad his solet intellegat. Ea oportere gloriatur dissentiunt mea, ex modus iisque quo, ei quo nostro commune verterem.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT34.jpg", 30.00, 0, 35, c5);
        Item iT35 = new Item("Portable Bear Speaker in Fun Colors", "Ei eos clita definiebas, libris regione conceptam vel cu. Eos erant errem voluptatibus cu. Nec at probo possim delenit, eu velit iudico dissentiunt mel, sit dicit denique cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT35.jpg", 25.00,5, 23, c5);
        Item iT36 = new Item("Bear in Meadow Pattern Laptop Case 13inches", "An amet admodum pri, ut vim numquam dissentiunt, in etiam iudico legimus mei. Qui utamur laboramus cotidieque cu, habeo convenire maluisset eam ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT36.jpeg", 40.00, 10, 24, c5);
        Item iT37 = new Item( "Cable Protection Bear Cover", "Laudem admodum periculis sea et, eos nostro tritani dolorum ut. No iusto doming appellantur pri, qui te audiam iriure suscipit. Melius facilisi usu et.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT37.png", 29.00, 0, 16, c5);
        Item iT38 = new Item( "Kawaii Bear Hidden USB 500G", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur. Ex mel antiopam contentiones, nam ea adhuc exerci dolore.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT38.jpg", 75.00, 20, 3, c5);
        Item iT39 = new Item( "Brown Koala Bear Hidden USB 125G", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT39.jpg", 35.00, 0, 4, c5);
        Item iT40 = new Item( "Pretty Rilakkuma Hidden USB 48G", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in, mutat audiam imperdiet qui ad, te simul graecis democritum eum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT40.jpg", 32.95, 0, 8, c5);
        Item iT41 = new Item( "Yogi Bear Hidden USB 36G", "Ius oblique perpetua an, in vix postea equidem laoreet, nec eu sonet diceret. Ferri dicant disputationi his ut, inermis patrioque mea te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT41.jpeg", 20.00, 0, 35, c5);
        Item iT42 = new Item("Brown Rilakkuma Hidden USB 12G", "Ad qui dignissim adolescens comprehensam, cum elitr praesent an. Vocent invenire consetetur has ei. Cum utinam reprehendunt ex. Sit ex dicta sensibus, usu feugait accusata repudiare ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT42.jpg", 25.00,5, 23, c5);
        Item iT43 = new Item("Pink Rilakkuma Hidden USB 12G", "Ad usu wisi fabulas torquatos, at salutandi interpretaris qui. Eum no affert nonumes. Sit ubique nusquam disputationi ut, dicunt legendos ne nec, nostrud molestie id usu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT43.jpg", 25.00, 10, 24, c5);
        Item iT44 = new Item( "Nanum Portable Pink Speaker", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id.=",
                "http://bw.ausgrads.academy/images/grizzlystore/iT44.jpeg", 34.99, 0, 8, c5);
        Item iT45 = new Item( "Tuxedo Bear Hidden USB", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne, in tollit vidisse laoreet sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT45.jpg", 18.99, 0, 35, c5);
        Item iT46 = new Item("Nanum Portable Grey Speaker", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT46.jpeg", 35.00,5, 23, c5);
        Item iT47 = new Item("USB C Bear Paw Cable", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT47.jpg", 30.00, 10, 24, c5);
        Item iT48 = new Item("Winnie the Pooh Head Hidden USB", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT48.jpg", 40.00, 0, 5, c5);
        Item iT49 = new Item( "Winnie the Pooh Hidden USB", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT49.jpg", 19.99, 25, 10, c5);
        Item iT50 = new Item( "USB C Pear Paw and Head Cable", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis. Vim ei assum abhorreant, posse nostrum qualisque ea mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT50.jpg", 29.99, 0, 12, c5);
        Item iT51 = new Item( "Fluffy Sleeping Headphones", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT51.jpeg", 32.00, 0, 15, c5);
        Item iT52 = new Item( "Electronic Cooling Sleeping Mask", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT52.jpg", 21.00, 30, 12, c5);
        Item iT53 = new Item( "Teddy Bear Bow Headless Hidden USB", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT53.jpg", 19.99, 0, 16, c5);
        Item iT54 = new Item( "Teddy Bear in TShirt Hidden USB", "Eum ad ullum nominati, vim ne animal sententiae. Convenire philosophia pri ea. Cum summo homero suavitate eu, te magna viris scaevola pri.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT54.jpg", 49.99, 20, 3, c5);
        Item iT55 = new Item( "Light Blue Hand Held Bear Electronic Fan", "Mel eu quidam nostro. Mei at malorum aliquid delectus, eius posse integre has te. An mel idque legere, an per congue vocibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT55.jpg", 130.00, 0, 4, c5);
        Item iT56 = new Item( "Brown Hand Held Bear Electronic Fan", "Persius fabulas mea an, ignota petentium gubergren ei has. Recteque intellegam mea ea. Consequat mediocritatem ne pri, sed eu meis posse appetere.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT56.jpg", 30.00, 0, 8, c5);
        Item iT57 = new Item( "Mini USB Desk Lamp", "Aeque postulant erroribus an eum, ad his solet intellegat. Ea oportere gloriatur dissentiunt mea, ex modus iisque quo, ei quo nostro commune verterem.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT57.jpg", 50.00, 0, 35, c5);
        Item iT58 = new Item( "Red Bear Hidden USB", "Ei eos clita definiebas, libris regione conceptam vel cu. Eos erant errem voluptatibus cu. Nec at probo possim delenit, eu velit iudico dissentiunt mel, sit dicit denique cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT58.jpg", 17.55,5, 23, c5);
        Item iT59 = new Item("Polar Bear Night Light in Fun Colors", "An amet admodum pri, ut vim numquam dissentiunt, in etiam iudico legimus mei. Qui utamur laboramus cotidieque cu, habeo convenire maluisset eam ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT59.jpg", 25.00, 10, 24, c5);
        Item iT60 = new Item( "MultiPort USB Bear with Inbuilt Speaker", "Laudem admodum periculis sea et, eos nostro tritani dolorum ut. No iusto doming appellantur pri, qui te audiam iriure suscipit..",
                "http://bw.ausgrads.academy/images/grizzlystore/iT60.jpg", 60.00, 0, 16, c5);
        Item iT61 = new Item( "Fanless Brown Hand Held Bear Electronic Fan", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT61.jpg", 30.00, 20, 3, c5);
        Item iT62 = new Item( "Grey Blue Bear Mug Warmer USB", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT62.jpg", 30.00, 0, 4, c5);
        Item iT63 = new Item( "Bear Plant Hidden USB", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in, mutat audiam imperdiet qui ad, te simul graecis democritum eum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT63.jpg", 25.00, 0, 8, c5);
        Item iT64 = new Item( "Light Teal Bear Humidifier USB", "Ius oblique perpetua an, in vix postea equidem laoreet, nec eu sonet diceret. Ferri dicant disputationi his ut, inermis patrioque mea te.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT64.jpg", 31.00, 0, 35, c5);
        Item iT65 = new Item("Retractable Panda Bear USB C Cable", "Ad qui dignissim adolescens comprehensam, cum elitr praesent an. Vocent invenire consetetur has ei. Cum utinam reprehendunt ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT65.jpg", 99.99,5, 23, c5);
        Item iT66 = new Item("Desk Standing Bear Electronic Fan", "Ad usu wisi fabulas torquatos, at salutandi interpretaris qui. Eum no affert nonumes. Sit ubique nusquam disputationi ut, dicunt legendos ne nec, nostrud molestie id usu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT66.jpg", 99.99, 10, 24, c5);
        Item iT67 = new Item( "Rilakkuma Mouse", "Tollit pertinax ei his, at omnis possim feugait mei. Usu nisl reque nobis ut, vel at animal suscipiantur. Ex mel antiopam contentiones, nam ea adhuc exerci dolore.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT67.jpg", 35.00, 20, 3, c5);
        Item iT68 = new Item( "Bear in the Square Record", "Affert erroribus adipiscing ut est, pericula quaerendum consequuntur eu eam. Te est honestatis theophrastus, veniam causae scribentur vel ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT68.jpg", 8.99, 0, 4, c5);
        Item iT69 = new Item( "Edgy Bear Silhouette PopSocket", "Nec in mundi persius. Vim aeque graece consectetuer ne, ipsum nonumes abhorreant ad qui. Invidunt honestatis ius in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iT69.jpg", 15.00, 0, 8, c5);


        Item iY01 = new Item("Brown Bear Mobile Simple", "In sea vide nostrud, tantas consul argumentum an nec, no mel persecuti scripserit. Usu viderer docendi accommodare in, dolores repudiandae id vel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY01.jpg", 39.99, 0, 7, c6);
        Item iY02 = new Item( "Electronic Bear in PJs Mobile", "Ad sed rebum soluta, homero percipitur ius eu, cu nam integre feugiat. An nec unum voluptua complectitur, eleifend abhorreant ad est, ne tractatos honestatis vel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY02.jpg", 19.99, 25, 10, c6);
        Item iY03 = new Item( "Large Scale Black Bear Mama and Cub Soft Toy", "In primis suavitate vim. Ornatus ceteros quo eu, hinc veri bonorum nam ex. Vis an malis labore prompta, populo recteque pro ea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY03.jpeg", 21.95, 0, 12, c6);
        Item iY04 = new Item( "Panda Bear Mama and Cub Soft Toy", "Purto doctus at per. Illud graecis has et. Eu discere eligendi omittantur nec, duo an labitur eloquentiam, clita indoctum ex quo.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY04.jpg", 21.95, 0, 15, c6);
        Item iY05 = new Item( "Rilakkuma Music Soft Toy", "Officiis pericula omittantur vim ut. Ne quo esse malorum ancillae, euismod recteque eum at. At ius percipit deterruisset, cum eu eirmod maluisset tincidunt.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY05.jpg", 60.00, 30, 12, c6);
        Item iY06 = new Item( "Customisable First Christmas Santa Bear Themed Bag", "Qui eu fabellas apeirian, mei ex omnium explicari. Nec ea veri equidem partiendo. Liber possim percipit no vis.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY06.jpg", 30.00, 0, 16, c6);
        Item iY07 = new Item( "Garrish Baby Walker", "Accusamus disputationi definitionem nam ut, eum eu aperiam urbanitas voluptatum. Et reque iisque convenire duo, no nam vocibus alienum.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY07.jpg", 30.00, 20, 3, c6);
        Item iY08 = new Item( "My First Christmas Teddy Bear", "Id tempor inermis omittantur sed. Et usu tantas sapientem, sit te malis menandri prodesset. Quas volumus ancillae eam ad.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY08.jpg", 30.00, 0, 4, c6);
        Item iY09 = new Item( "Classic Teddy Bear Furry Bow", "Ex has choro officiis antiopam, vel omnes partem cu. Porro elaboraret et sea. At has tollit tractatos. Ius unum modus percipit an.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY09.jpg", 30.00, 0, 8, c6);
        Item iY10 = new Item( "Classic Teddy Bear Furry", "Epicuri concludaturque mei eu, sit etiam nemore pertinax id, vitae semper detraxit no eum. Convenire adolescens ad eum. Vis ne eius semper, ne unum ubique posidonium mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY10.jpg", 30.00, 0, 35, c6);
        Item iY11 = new Item("Classic Teddy Brown Bear Furry Bow", "Modus detracto mediocrem est id, an euismod argumentum pro. Et appareat recteque facilisis cum, atqui sapientem honestatis an vix, cibo vidisse ei pri. ",
                "http://bw.ausgrads.academy/images/grizzlystore/iY11.jpg", 30.00,5, 23, c6);
        Item iY12 = new Item("Large Teddy Bear Hand Stitched", "Petentium consulatu definitionem vis no. Mel suas eripuit repudiare et, malorum labitur ex eam. No quot elaboraret est, ancillae mandamus pro cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY12.jpg", 25.00, 10, 24, c6);
        Item iY13 = new Item("Pink Velvet Teddy Bear", "His no oporteat disputando. Reque splendide vis no. Dicant facete sit te. Habemus partiendo vituperata cu quo, invidunt sadipscing cotidieque ex quo. Mea eu alienum perfecto.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY13.gif", 30.00, 0, 5, c6);
        Item iY14 = new Item( "Blue Velvet Teddy Bear", "Id civibus molestie singulis duo, tempor altera duo et. Est quod tollit latine ea, impetus vulputate sed ex. At legere electram sea, munere petentium dissentiet duo no.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY14.gif", 35.99, 25, 10, c6);
        Item iY15 = new Item( "Tatty Teddy Bear", "Usu ad cetero detracto. Posidonium concludaturque per cu. In vel audire quaeque philosophia, usu ne quas laudem platonem, in eos nostro dolorem.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY15.jpg", 60.00, 0, 12, c6);
        Item iY16 = new Item( "Scottish Teddy Bear with Bagpipes", "Liber lobortis rationibus at mel, assum commodo appellantur ex qui. Vis cibo nulla persecuti ei, pro an quas dicat inimicus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY16.jpg", 30.00, 0, 15, c6);
        Item iY17 = new Item( "Tatty Teddy Bear Bridesmaids Gift", "Nulla feugiat usu cu, eam et audiam laboramus intellegebat. Nec discere copiosae expetenda ad, per an nulla elaboraret.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY17.jpg", 100.00, 30, 12, c6);
        Item iY18 = new Item( "Tatty Teddy Bear Baby Daughter Gift", "In cum augue vulputate signiferumque. Ut nam solum dicit, esse facilisis aliquando nam te, quo alii disputationi mediocritatem ut.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY18.jpg", 60.00, 0, 16, c6);
        Item iY19 = new Item( "Classic Blue Teddy Bear", "Dicit veniam percipit pro an, verterem gloriatur elaboraret pri in. Mei esse adhuc quaeque eu, mea te inermis patrioque disputationi, an affert ceteros sea.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY19.jpg", 25.00, 20, 3, c6);
        Item iY20 = new Item( "Tatty Teddy Bear Hug TShirt", "Odio consulatu eos ea. An idque patrioque suscipiantur per. Vocent suscipiantur quo ea, id nam consul theophrastus. In facete aliquam usu, mea eu sint adipiscing.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY20.jpg", 34.99, 0, 4, c6);
        Item iY21 = new Item( "Tatty Teddy Bear I Love You Heart", "Saperet iudicabit in duo, per quidam dissentiet an. Modo lorem viderer ne sit, usu id lorem omnesque offendit, vide vivendum nec id.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY21.jpg", 9.99, 0, 8, c6);
        Item iY22 = new Item( "Hand Knitted Grandma's Teddy Bear", "Ea verear accusata nam, eam ei propriae voluptatum, has ei mundi prodesset forensibus. At sit putent equidem habemus, per volumus accusamus ne.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY22.jpg", 9.99, 0, 35, c6);
        Item iY23 = new Item("Prep School Teddy Bear", "Ne vis legimus fierent. Tempor quodsi prompta id per. His no minim timeam vocibus. Usu an tempor fierent, modus indoctum et has, ornatus persecuti nec ex.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY23.jpeg", 17.99,5, 23, c6);
        Item iY24 = new Item("Patriotic Teddy Bear", "An per quas nominavi, assentior persecuti ne sit. Est id iuvaret invidunt eloquentiam, eros delicatissimi cum in, vim ei habemus docendi. Duo sumo singulis no.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY24.jpg", 24.99, 10, 24, c6);
        Item iY25 = new Item("Customisable Teddy Bear with Shirt", "Modus harum at vix. Zril disputando reformidans sit in, omnis eleifend no ius. Officiis scriptorem mea eu, eu congue pertinax molestiae vix, his partem corpora in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY25.jpg", 45.00, 0, 5, c6);
        Item iY26 = new Item( "Canada Teddy Bear", "Id iuvaret volutpat corrumpit nam, usu no option delicata similique, latine tractatos eu sit. Prompta salutatus sit cu, et per solet persius. Usu amet antiopam an, ei pri enim laoreet dolores.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY26.jpeg", 65.00, 25, 10, c6);
        Item iY27 = new Item( "Birthday Cupcake Teddy Bear", "Mucius recteque ullamcorper id has, illud idque at eos. Eos primis vivendo singulis no, et duo mucius maiestatis. Vim ei assum abhorreant, posse nostrum qualisque ea mel.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY27.jpg", 19.99, 0, 12, c6);
        Item iY28 = new Item( "I Love U Valentine's Bear", "Volumus electram ei est, ad eos nullam noluisse. Ei eos vidit intellegebat, cibo porro consetetur has ne, aperiri deleniti vix in.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY28.jpeg", 39.99, 0, 15, c6);
        Item iY29 = new Item( "I Love U Valentine's Pink Bear", "Sit an utamur dolorum, hinc molestiae et mel. Nostro perfecto mel no, quo ei offendit periculis, id eum aeque theophrastus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY29.jpg", 30.00, 30, 12, c6);
        Item iY30 = new Item( "Panda Bear Mama and Cub Set", "Mel oblique euismod hendrerit te, tempor ridens ullamcorper ex vis. No per tale labores postulant.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY30.jpg", 19.99, 0, 16, c6);
        Item iY31 = new Item( "I Love U Valentine's White Fluffy Bear", "Eum ad ullum nominati, vim ne animal sententiae. Convenire philosophia pri ea. Cum summo homero suavitate eu, te magna viris scaevola pri.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY31.jpg", 49.99, 20, 3, c6);
        Item iY32 = new Item( "Valentine's Bear with Fake Rose and Vase", "Mel eu quidam nostro. Mei at malorum aliquid delectus, eius posse integre has te. An mel idque legere, an per congue vocibus.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY32.jpg", 26.95, 0, 4, c6);
        Item iY33 = new Item( "Soft Bear Pillow", "Persius fabulas mea an, ignota petentium gubergren ei has. Recteque intellegam mea ea. Consequat mediocritatem ne pri, sed eu meis posse appetere.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY33.jpg", 35.60, 0, 8, c6);
        Item iY34 = new Item( "Speaking Teddy Bear", "Aeque postulant erroribus an eum, ad his solet intellegat. Ea oportere gloriatur dissentiunt mea, ex modus iisque quo, ei quo nostro commune verterem.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY34.jpg", 30.00, 0, 35, c6);
        Item iY35 = new Item("My First Teddy Bear", "Ei eos clita definiebas, libris regione conceptam vel cu. Eos erant errem voluptatibus cu. Nec at probo possim delenit, eu velit iudico dissentiunt mel, sit dicit denique cu.",
                "http://bw.ausgrads.academy/images/grizzlystore/iY35.jpg", 25.00,5, 23, c6);


        itemRepository.save(iA01);
        itemRepository.save(iA02);
        itemRepository.save(iA03);
        itemRepository.save(iA04);
        itemRepository.save(iA05);
        itemRepository.save(iA06);
        itemRepository.save(iA07);
        itemRepository.save(iA08);
        itemRepository.save(iA09);
        itemRepository.save(iA10);
        itemRepository.save(iA11);
        itemRepository.save(iA12);
        itemRepository.save(iA13);
        itemRepository.save(iA14);
        itemRepository.save(iA15);
        itemRepository.save(iA16);
        itemRepository.save(iA17);
        itemRepository.save(iA18);
        itemRepository.save(iA19);
        itemRepository.save(iA20);
        itemRepository.save(iA21);
        itemRepository.save(iA22);
        itemRepository.save(iA23);
        itemRepository.save(iA24);
        itemRepository.save(iA25);
        itemRepository.save(iA26);
        itemRepository.save(iA27);
        itemRepository.save(iA28);
        itemRepository.save(iA29);
        itemRepository.save(iA30);
        itemRepository.save(iA31);
        itemRepository.save(iA32);
        itemRepository.save(iA33);
        itemRepository.save(iA34);
        itemRepository.save(iA35);
        itemRepository.save(iA36);
        itemRepository.save(iA37);
        itemRepository.save(iA38);
        itemRepository.save(iA39);
        itemRepository.save(iA40);
        itemRepository.save(iA41);
        itemRepository.save(iA42);
        itemRepository.save(iA43);


        itemRepository.save(iC01);
        itemRepository.save(iC02);
        itemRepository.save(iC03);
        itemRepository.save(iC04);
        itemRepository.save(iC05);
        itemRepository.save(iC06);
        itemRepository.save(iC07);
        itemRepository.save(iC08);
        itemRepository.save(iC09);
        itemRepository.save(iC10);
        itemRepository.save(iC11);
        itemRepository.save(iC12);
        itemRepository.save(iC13);
        itemRepository.save(iC14);
        itemRepository.save(iC15);
        itemRepository.save(iC16);
        itemRepository.save(iC17);
        itemRepository.save(iC18);
        itemRepository.save(iC19);
        itemRepository.save(iC20);
        itemRepository.save(iC21);
        itemRepository.save(iC22);
        itemRepository.save(iC23);
        itemRepository.save(iC24);
        itemRepository.save(iC25);
        itemRepository.save(iC26);
        itemRepository.save(iC27);
        itemRepository.save(iC28);
        itemRepository.save(iC29);
        itemRepository.save(iC30);
        itemRepository.save(iC31);
        itemRepository.save(iC32);
        itemRepository.save(iC33);
        itemRepository.save(iC34);
        itemRepository.save(iC35);
        itemRepository.save(iC36);
        itemRepository.save(iC37);
        itemRepository.save(iC38);
        itemRepository.save(iC39);
        itemRepository.save(iC40);
        itemRepository.save(iC41);
        itemRepository.save(iC42);
        itemRepository.save(iC43);
        itemRepository.save(iC44);
        itemRepository.save(iC45);
        itemRepository.save(iC46);
        itemRepository.save(iC47);
        itemRepository.save(iC48);
        itemRepository.save(iC49);
        itemRepository.save(iC50);
        itemRepository.save(iC51);
        itemRepository.save(iC52);
        itemRepository.save(iC53);
        itemRepository.save(iC54);
        itemRepository.save(iC55);
        itemRepository.save(iC56);
        itemRepository.save(iC57);
        itemRepository.save(iC58);
        itemRepository.save(iC59);
        itemRepository.save(iC60);
        itemRepository.save(iC61);
        itemRepository.save(iC62);
        itemRepository.save(iC63);
        itemRepository.save(iC64);
        itemRepository.save(iC65);
        itemRepository.save(iC66);
        itemRepository.save(iC67);
        itemRepository.save(iC68);
        itemRepository.save(iC69);
        itemRepository.save(iC70);

        itemRepository.save(iH01);
        itemRepository.save(iH02);
        itemRepository.save(iH03);
        itemRepository.save(iH04);
        itemRepository.save(iH05);
        itemRepository.save(iH06);
        itemRepository.save(iH07);
        itemRepository.save(iH08);
        itemRepository.save(iH09);
        itemRepository.save(iH10);
        itemRepository.save(iH11);
        itemRepository.save(iH12);
        itemRepository.save(iH13);
        itemRepository.save(iH14);
        itemRepository.save(iH15);
        itemRepository.save(iH16);
        itemRepository.save(iH17);
        itemRepository.save(iH18);
        itemRepository.save(iH19);
        itemRepository.save(iH20);
        itemRepository.save(iH21);
        itemRepository.save(iH22);
        itemRepository.save(iH23);
        itemRepository.save(iH24);
        itemRepository.save(iH25);
        itemRepository.save(iH26);
        itemRepository.save(iH27);
        itemRepository.save(iH28);
        itemRepository.save(iH29);
        itemRepository.save(iH30);

        itemRepository.save(iJ01);
        itemRepository.save(iJ02);
        itemRepository.save(iJ03);
        itemRepository.save(iJ04);
        itemRepository.save(iJ05);
        itemRepository.save(iJ06);
        itemRepository.save(iJ07);
        itemRepository.save(iJ08);
        itemRepository.save(iJ09);
        itemRepository.save(iJ10);
        itemRepository.save(iJ11);
        itemRepository.save(iJ12);
        itemRepository.save(iJ13);
        itemRepository.save(iJ14);
        itemRepository.save(iJ15);
        itemRepository.save(iJ16);
        itemRepository.save(iJ17);
        itemRepository.save(iJ18);
        itemRepository.save(iJ19);
        itemRepository.save(iJ20);
        itemRepository.save(iJ21);
        itemRepository.save(iJ22);
        itemRepository.save(iJ23);
        itemRepository.save(iJ24);
        itemRepository.save(iJ25);
        itemRepository.save(iJ26);
        itemRepository.save(iJ27);
        itemRepository.save(iJ28);
        itemRepository.save(iJ29);
        itemRepository.save(iJ30);
        itemRepository.save(iJ31);
        itemRepository.save(iJ32);
        itemRepository.save(iJ33);
        itemRepository.save(iJ34);
        itemRepository.save(iJ35);
        itemRepository.save(iJ36);
        itemRepository.save(iJ37);
        itemRepository.save(iJ38);
        itemRepository.save(iJ39);
        itemRepository.save(iJ40);
        itemRepository.save(iJ41);

        itemRepository.save(iT01);
        itemRepository.save(iT02);
        itemRepository.save(iT03);
        itemRepository.save(iT04);
        itemRepository.save(iT05);
        itemRepository.save(iT06);
        itemRepository.save(iT07);
        itemRepository.save(iT08);
        itemRepository.save(iT09);
        itemRepository.save(iT10);
        itemRepository.save(iT11);
        itemRepository.save(iT12);
        itemRepository.save(iT13);
        itemRepository.save(iT14);
        itemRepository.save(iT15);
        itemRepository.save(iT16);
        itemRepository.save(iT17);
        itemRepository.save(iT18);
        itemRepository.save(iT19);
        itemRepository.save(iT20);
        itemRepository.save(iT21);
        itemRepository.save(iT22);
        itemRepository.save(iT23);
        itemRepository.save(iT24);
        itemRepository.save(iT25);
        itemRepository.save(iT26);
        itemRepository.save(iT27);
        itemRepository.save(iT28);
        itemRepository.save(iT29);
        itemRepository.save(iT30);
        itemRepository.save(iT31);
        itemRepository.save(iT32);
        itemRepository.save(iT33);
        itemRepository.save(iT34);
        itemRepository.save(iT35);
        itemRepository.save(iT36);
        itemRepository.save(iT37);
        itemRepository.save(iT38);
        itemRepository.save(iT39);
        itemRepository.save(iT40);
        itemRepository.save(iT41);
        itemRepository.save(iT42);
        itemRepository.save(iT43);
        itemRepository.save(iT44);
        itemRepository.save(iT45);
        itemRepository.save(iT46);
        itemRepository.save(iT47);
        itemRepository.save(iT48);
        itemRepository.save(iT49);
        itemRepository.save(iT50);
        itemRepository.save(iT51);
        itemRepository.save(iT52);
        itemRepository.save(iT53);
        itemRepository.save(iT54);
        itemRepository.save(iT55);
        itemRepository.save(iT56);
        itemRepository.save(iT57);
        itemRepository.save(iT58);
        itemRepository.save(iT59);
        itemRepository.save(iT60);
        itemRepository.save(iT61);
        itemRepository.save(iT62);
        itemRepository.save(iT63);
        itemRepository.save(iT64);
        itemRepository.save(iT65);
        itemRepository.save(iT66);
        itemRepository.save(iT67);
        itemRepository.save(iT68);
        itemRepository.save(iT69);

        itemRepository.save(iY01);
        itemRepository.save(iY02);
        itemRepository.save(iY03);
        itemRepository.save(iY04);
        itemRepository.save(iY05);
        itemRepository.save(iY06);
        itemRepository.save(iY07);
        itemRepository.save(iY08);
        itemRepository.save(iY09);
        itemRepository.save(iY10);
        itemRepository.save(iY11);
        itemRepository.save(iY12);
        itemRepository.save(iY13);
        itemRepository.save(iY14);
        itemRepository.save(iY15);
        itemRepository.save(iY16);
        itemRepository.save(iY17);
        itemRepository.save(iY18);
        itemRepository.save(iY19);
        itemRepository.save(iY20);
        itemRepository.save(iY21);
        itemRepository.save(iY22);
        itemRepository.save(iY23);
        itemRepository.save(iY24);
        itemRepository.save(iY25);
        itemRepository.save(iY26);
        itemRepository.save(iY27);
        itemRepository.save(iY28);
        itemRepository.save(iY29);
        itemRepository.save(iY30);
        itemRepository.save(iY31);
        itemRepository.save(iY32);
        itemRepository.save(iY33);
        itemRepository.save(iY34);
        itemRepository.save(iY35);

        return "Successfully saved seed data of items and categories to database";
    }




}
